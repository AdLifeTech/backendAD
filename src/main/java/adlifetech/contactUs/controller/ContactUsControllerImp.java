package adlifetech.contactUs.controller;

import adlifetech.contactUs.dto.ContactUsDTO;
import adlifetech.contactUs.service.ContactUsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/api/contactus")
public class ContactUsControllerImp implements ContactUsController {

    @Autowired
    ContactUsService contactUsService;
    @Override
    public ResponseEntity<?> saveContactUs(ContactUsDTO contactUsDTO) {
        return contactUsService.saveContactUs(contactUsDTO);
    }
}
