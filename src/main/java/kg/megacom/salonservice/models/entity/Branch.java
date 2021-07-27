package kg.megacom.salonservice.models.entity;

import kg.megacom.salonservice.models.dto.PhoneDto;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "branches")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private double lat;
    private double lon;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "salon_id")
    private Salon salon;

    @OneToMany
    @JoinColumn(name = "phones")
    List<Phone> phones;

}
