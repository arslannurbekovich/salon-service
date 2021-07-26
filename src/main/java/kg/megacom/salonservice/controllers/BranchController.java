package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.BranchDto;
import kg.megacom.salonservice.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping("/save")
    public BranchDto save(@RequestBody BranchDto branchDto){
        return branchService.save(branchDto);
    }

}
