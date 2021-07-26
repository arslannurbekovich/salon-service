package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.SalonDto;
import kg.megacom.salonservice.services.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/salon")
public class SalonController {

    @Autowired
    private SalonService salonService;

    @PostMapping("/save")
    public SalonDto save(@RequestBody SalonDto salonDto) {
        return salonService.save(salonDto);
    }

    @PostMapping("/update")
    public SalonDto update(@RequestBody SalonDto salonDto) {
        return salonService.update(salonDto);
    }

    @GetMapping("/all")
    public List<SalonDto> findAll() {
        return salonService.findAll();
    }

    @GetMapping("/{id}")
    public SalonDto findById(@PathVariable Long id) {
        return salonService.findById(id);
    }

    @DeleteMapping("/delete/{salon_id}")
    public void delete(@PathVariable Long salon_id) {
        salonService.delete(salon_id);
    }

}
