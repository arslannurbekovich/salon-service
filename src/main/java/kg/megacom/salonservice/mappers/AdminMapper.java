package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.AdminDto;
import kg.megacom.salonservice.models.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdminMapper {

    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);
    Admin toEntity(AdminDto adminDto);
    AdminDto toDto(Admin admin);

}
