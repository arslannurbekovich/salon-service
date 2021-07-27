package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.MasterDto;
import kg.megacom.salonservice.models.dto.MasterWorkDayDto;

import java.util.List;

public interface MasterWorkDayService {

    MasterWorkDayDto save(MasterWorkDayDto masterWorkDayDto);

    List<MasterWorkDayDto> findAll();

    MasterWorkDayDto findById(Long id);

    List<MasterWorkDayDto> findByMaster(Long id);
}
