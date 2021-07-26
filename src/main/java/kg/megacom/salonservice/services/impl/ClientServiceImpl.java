package kg.megacom.salonservice.services.impl;

import kg.megacom.salonservice.dao.ClientRepo;
import kg.megacom.salonservice.mappers.ClientMapper;
import kg.megacom.salonservice.models.dto.ClientDto;
import kg.megacom.salonservice.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Override
    public ClientDto save(ClientDto clientDto) {
            return ClientMapper.INSTANCE.toDto(clientRepo.save(ClientMapper.INSTANCE.toEntity(clientDto)));
    }

    @Override
    public ClientDto update(ClientDto clientDto) {
        return null;
    }

    @Override
    public List<ClientDto> findAll() {
        return null;
    }

    @Override
    public ClientDto findById(Long id) {
        return null;
    }

}
