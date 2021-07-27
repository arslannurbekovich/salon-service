package kg.megacom.salonservice.models.dto;

import kg.megacom.salonservice.models.entity.StatusReserved;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class ReservedHourDto {

    private Long id;
    private LocalDate startTime;
    private LocalDate endTime;
    private MasterWorkDayDto masterWorkDay;
    private ClientDto client;
    private StatusReserved status;
    private AdminDto admin;

}
