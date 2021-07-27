package kg.megacom.salonservice.services.impl;

import kg.megacom.salonservice.dao.AdminRepo;
import kg.megacom.salonservice.exceptions.NotFound;
import kg.megacom.salonservice.mappers.AdminMapper;
import kg.megacom.salonservice.models.dto.AdminDto;
import kg.megacom.salonservice.models.entity.Admin;
import kg.megacom.salonservice.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public AdminDto save(AdminDto adminDto) {
        return AdminMapper.INSTANCE.toDto(adminRepo.save(AdminMapper.INSTANCE.toEntity(adminDto)));
    }

    @Override
    public AdminDto update(AdminDto adminDto) {
        if(!adminRepo.existsById(adminDto.getId())){
            throw new NotFound("Администратор не найден!");
        }
        return AdminMapper.INSTANCE.toDto(adminRepo.save(AdminMapper.INSTANCE.toEntity(adminDto)));
    }

    @Override
    public List<AdminDto> findAll() {
        List<Admin> admins = adminRepo.findAll();
        return AdminMapper.INSTANCE.toDtos(admins);
    }

    @Override
    public AdminDto findById(Long id) {
        Admin admin = adminRepo.findById(id)
                .orElseThrow(() -> new NotFound("Салон не найден!"));
        return AdminMapper.INSTANCE.toDto(admin);
    }

}
