package kg.megacom.salonservice.services;

import kg.megacom.salonservice.models.dto.BranchDto;
import kg.megacom.salonservice.models.json.BranchDtoAll;

import java.util.List;

public interface BranchService {

    BranchDto save(BranchDto branchDto);

    List<BranchDto> findAll();

    BranchDto findById(Long id);

    List<BranchDto> findBySalon(Long id);

}
