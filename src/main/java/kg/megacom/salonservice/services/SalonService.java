package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.SalonDto;

import java.util.List;

public interface SalonService {

    SalonDto save(SalonDto salonDto);

    SalonDto update(SalonDto salonDto);

    List<SalonDto> findAll();

    SalonDto findById(Long id);

    void delete(Long salon_id);
}
