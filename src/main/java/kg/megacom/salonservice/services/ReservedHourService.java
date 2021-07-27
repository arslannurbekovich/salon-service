package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.ReservedHourDto;

import java.util.List;

public interface ReservedHourService {

    ReservedHourDto save(ReservedHourDto reservedHourDto);

    List<ReservedHourDto> findAll();

    ReservedHourDto findById(Long id);

    ReservedHourDto update(ReservedHourDto adminDto);

}
