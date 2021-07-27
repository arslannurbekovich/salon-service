package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.AdminDto;
import kg.megacom.salonservice.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    public AdminDto save(@RequestBody AdminDto adminDto) {
        return adminService.save(adminDto);
    }

    @PostMapping("/update")
    public AdminDto update(@RequestBody AdminDto adminDto) {
        return adminService.update(adminDto);
    }

    @GetMapping("/all")
    public List<AdminDto> findAll() {
        return adminService.findAll();
    }

    @GetMapping("/{id}")
    public AdminDto findById(@PathVariable Long id) {
        return adminService.findById(id);
    }

}
