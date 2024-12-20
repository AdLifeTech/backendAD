package adlifetech.contactUs.controller;

import adlifetech.contactUs.dto.ContactUsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ContactUsController {

    @PostMapping("/submit")
    ResponseEntity<?> saveContactUs(@RequestBody ContactUsDTO contactUsDTO);
}
