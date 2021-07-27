package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.MasterDto;
import kg.megacom.salonservice.models.entity.Master;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MasterMapper {

    MasterMapper INSTANCE = Mappers.getMapper(MasterMapper.class);
    Master toEntity(MasterDto masterDto);
    MasterDto toDto(Master master);

    List<MasterDto> toDtos(List<Master> masters);

}
