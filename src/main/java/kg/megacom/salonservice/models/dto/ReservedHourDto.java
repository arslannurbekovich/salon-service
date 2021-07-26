package kg.megacom.salonservice.models.dto;

import kg.megacom.salonservice.models.entity.StatusReserved;
import lombok.Data;

import java.util.Date;

@Data
public class ReservedHourDto {

    private Long id;
    private Date startTime;
    private Date endTime;
    private MasterWorkDayDto masterWorkDay;
    private ClientDto client;
    private StatusReserved status;
    private AdminDto admin;

}
