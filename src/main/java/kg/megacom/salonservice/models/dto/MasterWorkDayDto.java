package kg.megacom.salonservice.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MasterWorkDayDto {

    private Long id;
    private MasterDto master;
    private BranchDto branch;
    private String workDay;
    private Date startTime;
    private Date endTime;
    private Date addDate;
    private Date editDate;
    private AdminDto admin;

}
