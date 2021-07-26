package kg.megacom.salonservice.dao;

import kg.megacom.salonservice.models.entity.ReservedHour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedHourRepo extends JpaRepository<ReservedHour, Long> {
}
