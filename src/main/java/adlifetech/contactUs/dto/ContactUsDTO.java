package adlifetech.contactUs.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactUsDTO {

    private String firstName;
    private String lastName;
    private String email;
    private int number;
    private String message;
    private String createdBy;
    private String updatedBy;

}
