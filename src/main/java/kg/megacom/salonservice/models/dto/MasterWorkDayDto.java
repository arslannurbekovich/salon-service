package kg.megacom.salonservice.models.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class MasterWorkDayDto {

    private Long id;
    private MasterDto master;
    private BranchDto branch;
    private String workDay;
    private LocalDate startTime;
    private LocalDate endTime;
    private LocalDate addDate;
    private LocalDate editDate;
    private AdminDto admin;

}
