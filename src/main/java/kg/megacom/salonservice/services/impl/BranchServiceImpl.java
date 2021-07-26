package kg.megacom.salonservice.services.impl;

import kg.megacom.salonservice.dao.BranchRepo;
import kg.megacom.salonservice.mappers.BranchMapper;
import kg.megacom.salonservice.models.dto.BranchDto;
import kg.megacom.salonservice.models.json.BranchDtoAll;
import kg.megacom.salonservice.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepo branchRepo;

    @Override
    public BranchDto save(BranchDto branchDto) {
        return BranchMapper.INSTANCE.toDto(branchRepo.save(BranchMapper.INSTANCE.toEntity(branchDto)));
    }

}