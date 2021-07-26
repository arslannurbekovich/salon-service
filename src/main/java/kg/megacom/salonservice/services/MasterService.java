package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.MasterDto;

public interface MasterService {

    MasterDto save(MasterDto masterDto);

    MasterDto update(MasterDto masterDto);
}
