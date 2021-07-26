package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.ClientDto;
import kg.megacom.salonservice.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/save")
    public ClientDto save(@RequestBody ClientDto clientDto){
        return clientService.save(clientDto);
    }

    @PostMapping("/update")
    public ClientDto update(@RequestBody ClientDto clientDto){
        return clientService.update(clientDto);
    }

    @GetMapping("/all")
    public List<ClientDto> findAll() {
        return clientService.findAll();
    }

    @GetMapping("/{id}")
    public ClientDto findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

}
