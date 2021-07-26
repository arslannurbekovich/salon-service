package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.SalonDto;
import kg.megacom.salonservice.models.entity.Salon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SalonMapper {

    SalonMapper INSTANCE = Mappers.getMapper(SalonMapper.class);
    Salon toEntity(SalonDto salonDto);
    SalonDto toDto(Salon salon);

}
