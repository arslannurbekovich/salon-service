package kg.megacom.salonservice.dao;

import kg.megacom.salonservice.models.entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepo extends JpaRepository<Salon, Long> {

}
