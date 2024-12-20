package adlifetech.contactUs.service;

import adlifetech.contactUs.dto.ContactUsDTO;
import adlifetech.contactUs.model.ContactUs;
import adlifetech.contactUs.repository.ContactUsRepository;
import adlifetech.response.ResponseModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Optional;

@Service
public class ContactUsServiceImp implements ContactUsService{

    @Autowired
    ContactUsRepository contactUsRepository;
    @Override
    public ResponseEntity<?> saveContactUs(ContactUsDTO contactUsDTO) {
        ResponseModel responseModel = new ResponseModel();

        try {
            Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
            Optional<ContactUs> existingContact = contactUsRepository.findByEmailAndCreatedAt(contactUsDTO.getEmail(), currentTimestamp);

            if (existingContact.isPresent()) {
                responseModel.setMessage("A contact request with this email already exists for today.");
                responseModel.setCode("409");
                return new ResponseEntity<>(responseModel, HttpStatus.CONFLICT);
            }

            ContactUs contactUs = new ContactUs();
            contactUs.setFirstName(contactUsDTO.getFirstName());
            contactUs.setLastName(contactUsDTO.getLastName());
            contactUs.setEmail(contactUsDTO.getEmail());
            contactUs.setNumber(contactUsDTO.getNumber());
            contactUs.setMessage(contactUsDTO.getMessage());
            contactUs.setCreatedBy(contactUsDTO.getCreatedBy());
            contactUs.setCreatedAt(currentTimestamp);
            contactUs.setUpdatedBy(contactUsDTO.getUpdatedBy());
            contactUs.setUpdatedAt(currentTimestamp);

            contactUsRepository.save(contactUs);

            responseModel.setMessage("Contact request submitted successfully.");
            responseModel.setCode("201");
            responseModel.setData(contactUs);
            return new ResponseEntity<>(responseModel, HttpStatus.CREATED);

        } catch (Exception e) {
            responseModel.setMessage("An error occurred while processing the contact request.");
            responseModel.setCode("500");
            responseModel.setData(e.getMessage()); // Optional: Include the exception message for debugging.
            return new ResponseEntity<>(responseModel, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
