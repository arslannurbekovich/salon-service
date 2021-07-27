package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.MasterDto;

import java.util.List;

public interface MasterService {

    MasterDto save(MasterDto masterDto);

    MasterDto update(MasterDto masterDto);

    List<MasterDto> findAll();

    MasterDto findById(Long id);

}
