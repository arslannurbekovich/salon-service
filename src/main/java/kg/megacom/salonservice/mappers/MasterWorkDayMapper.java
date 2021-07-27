package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.MasterWorkDayDto;
import kg.megacom.salonservice.models.entity.MasterWorkDay;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MasterWorkDayMapper {

    MasterWorkDayMapper INSTANCE = Mappers.getMapper(MasterWorkDayMapper.class);
    MasterWorkDay toEntity(MasterWorkDayDto masterWorkDayDto);
    MasterWorkDayDto toDto(MasterWorkDay masterWorkDay);

    List<MasterWorkDayDto> toDtos(List<MasterWorkDay> masterWorkDays);

}
