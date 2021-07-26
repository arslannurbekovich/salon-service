package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.PhoneDto;
import kg.megacom.salonservice.models.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);
    Phone toEntity(PhoneDto phoneDto);
    PhoneDto toDto(Phone phone);

}
