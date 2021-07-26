package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.MasterDto;
import kg.megacom.salonservice.models.entity.Master;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MasterMapper {

    MasterMapper INSTANCE = Mappers.getMapper(MasterMapper.class);
    Master toEntity(MasterDto masterDto);
    MasterDto toDto(Master master);

}
