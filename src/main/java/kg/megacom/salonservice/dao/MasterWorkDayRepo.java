package kg.megacom.salonservice.dao;

import kg.megacom.salonservice.models.entity.MasterWorkDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterWorkDayRepo extends JpaRepository<MasterWorkDay, Long>{
}
