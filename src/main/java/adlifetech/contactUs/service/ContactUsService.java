package adlifetech.contactUs.service;

import adlifetech.contactUs.dto.ContactUsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ContactUsService {

    ResponseEntity<?> saveContactUs(ContactUsDTO contactUsDTO);
}
