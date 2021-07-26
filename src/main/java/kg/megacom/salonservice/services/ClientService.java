package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.ClientDto;

import java.util.List;

public interface ClientService {

    ClientDto save(ClientDto clientDto);

    ClientDto update(ClientDto clientDto);

    List<ClientDto> findAll();

    ClientDto findById(Long id);
}
