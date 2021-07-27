package kg.megacom.salonservice.dao;

import kg.megacom.salonservice.models.entity.Master;
import kg.megacom.salonservice.models.entity.MasterWorkDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterWorkDayRepo extends JpaRepository<MasterWorkDay, Long>{

    List<MasterWorkDay> findAllByMasterId(Long masterId);

}
