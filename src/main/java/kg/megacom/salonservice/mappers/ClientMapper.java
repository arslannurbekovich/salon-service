package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.ClientDto;
import kg.megacom.salonservice.models.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);
    Client toEntity(ClientDto clientDto);
    ClientDto toDto(Client client);

}
