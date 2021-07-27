package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.PhoneDto;
import kg.megacom.salonservice.models.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);
    Phone toEntity(PhoneDto phoneDto);
    PhoneDto toDto(Phone phone);

    List<Phone> toEntities(List<PhoneDto> phoneDtos);
    List<PhoneDto> toDtos(List<Phone> phones);
}
