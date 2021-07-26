package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.PhoneDto;
import kg.megacom.salonservice.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @PostMapping("/save")
    public PhoneDto save(@RequestBody PhoneDto phoneDto){
        return phoneService.save(phoneDto);
    }

}
