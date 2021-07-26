package kg.megacom.salonservice.models.dto;

import lombok.Data;

@Data
public class ClientDto {

    private Long id;
    private String name;
    private String phone;
    private int pin;

}
