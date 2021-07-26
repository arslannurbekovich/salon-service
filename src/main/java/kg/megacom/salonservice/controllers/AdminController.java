package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.AdminDto;
import kg.megacom.salonservice.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
