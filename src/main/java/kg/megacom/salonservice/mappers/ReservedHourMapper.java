package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.ReservedHourDto;
import kg.megacom.salonservice.models.entity.ReservedHour;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservedHourMapper {

    ReservedHourMapper INSTANCE = Mappers.getMapper(ReservedHourMapper.class);
    ReservedHour toEntity(ReservedHourDto reservedHourDto);
    ReservedHourDto toDto(ReservedHour reservedHour);

}
