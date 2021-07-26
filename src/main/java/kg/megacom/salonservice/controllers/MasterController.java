package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.MasterDto;
import kg.megacom.salonservice.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/master")
public class MasterController {

    @Autowired
    private MasterService masterService;

    @PostMapping("/save")
    public MasterDto save(@RequestBody MasterDto masterDto){
        return masterService.save(masterDto);
    }

    @PostMapping("/update")
    public MasterDto update(@RequestBody MasterDto masterDto){
        return masterService.update(masterDto);
    }

}
