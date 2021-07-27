package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.AdminDto;
import kg.megacom.salonservice.models.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AdminMapper {

    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);
    Admin toEntity(AdminDto adminDto);
    AdminDto toDto(Admin admin);

    List<AdminDto> toDtos(List<Admin> admins);

}
