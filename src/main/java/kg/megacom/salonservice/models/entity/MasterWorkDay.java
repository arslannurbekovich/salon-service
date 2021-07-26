package kg.megacom.salonservice.models.entity;

import lombok.Data;

import javax.persistence.*;
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
    private Date startTime;
    private Date endTime;
    private Date addDate;
    private Date editDate;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

}
