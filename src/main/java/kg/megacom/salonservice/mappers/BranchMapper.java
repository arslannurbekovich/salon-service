package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.dto.BranchDto;
import kg.megacom.salonservice.models.entity.Branch;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BranchMapper {

    BranchMapper INSTANCE = Mappers.getMapper(BranchMapper.class);
    Branch toEntity(BranchDto branchDto);
    BranchDto toDto(Branch branch);

}
