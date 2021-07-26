package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.AdminDto;

public interface AdminService {

    AdminDto save(AdminDto adminDto);

    AdminDto update(AdminDto adminDto);

}
