package kg.megacom.salonservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "master_work_days")
public class MasterWorkDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "master_id")
    private Master master;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    private String workDay;
    private LocalDate startTime;
    private LocalDate endTime;
    private LocalDate addDate;
    private LocalDate editDate;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

}
