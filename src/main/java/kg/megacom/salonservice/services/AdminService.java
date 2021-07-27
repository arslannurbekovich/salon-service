package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.AdminDto;

import java.util.List;

public interface AdminService {

    AdminDto save(AdminDto adminDto);

    AdminDto update(AdminDto adminDto);

    List<AdminDto> findAll();

    AdminDto findById(Long id);
}
