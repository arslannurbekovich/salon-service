package kg.megacom.salonservice.controllers;

import kg.megacom.salonservice.models.dto.BranchDto;
import kg.megacom.salonservice.models.dto.MasterWorkDayDto;
import kg.megacom.salonservice.models.dto.ReservedHourDto;
import kg.megacom.salonservice.models.json.GetMasters;
import kg.megacom.salonservice.services.BranchService;
import kg.megacom.salonservice.services.MasterWorkDayService;
import kg.megacom.salonservice.services.ReservedHourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/func")
public class FunctionController {

    @Autowired
    private BranchService branchService;

    @Autowired
    private MasterWorkDayService masterWorkDayService;

    @Autowired
    private ReservedHourService reservedHourService;

    @GetMapping("/get/branches{id}")
    public List<BranchDto> findBySalonId(@PathVariable Long id) {
        return branchService.findBySalon(id);
    }

    @GetMapping("/get/master-work-days{id}")
    public List<MasterWorkDayDto> findByMasterId(@PathVariable Long id) {
        return masterWorkDayService.findByMaster(id);
    }

    @GetMapping("/get/masters/workDay")
    public List<GetMasters> getMasters(@RequestParam Long branchId, @RequestParam("localDate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate workDay) {
        System.out.println(workDay);
        return masterWorkDayService.getMasterWorkDay(branchId, workDay);
    }

    @GetMapping("/get/reserved-hour/id")
    public List<ReservedHourDto> get(@RequestParam Long id) {
        return reservedHourService.findByMasterWorkDayId(id);
    }

}
