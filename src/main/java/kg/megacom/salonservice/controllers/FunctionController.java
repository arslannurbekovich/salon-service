package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.BranchDto;
import kg.megacom.salonservice.models.dto.MasterDto;
import kg.megacom.salonservice.models.dto.MasterWorkDayDto;
import kg.megacom.salonservice.services.BranchService;
import kg.megacom.salonservice.services.MasterService;
import kg.megacom.salonservice.services.MasterWorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/func")
public class FunctionController {

    @Autowired
    private BranchService branchService;

    @Autowired
    private MasterService masterService;

    @Autowired
    private MasterWorkDayService masterWorkDayService;

    @GetMapping("/branches{id}")
    public List<BranchDto> findBySalonId(@PathVariable Long id) {
        return branchService.findBySalon(id);
    }

    @GetMapping("/master-work-days{id}")
    public List<MasterWorkDayDto> findByMasterId(@PathVariable Long id){
        return masterWorkDayService.findByMaster(id);
    }

}
