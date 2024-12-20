package adlifetech.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum MessageCode {

    CONTACT_US_THANKS("CONT-CS-002"),
    CONTACT_US_INTERNAL_SERVER_ERROR("CONT-CISE-003"),
    CONTACT_US_TOMORROW("CONT-CT-004"),

    CONTACT_US_INVALID_EMAIL("CONT-CIE-001");

    @Setter
    private String name;
}
