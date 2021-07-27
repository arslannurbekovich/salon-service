package kg.megacom.salonservice.services.impl;

import kg.megacom.salonservice.dao.MasterWorkDayRepo;
import kg.megacom.salonservice.exceptions.NotFound;
import kg.megacom.salonservice.mappers.MasterWorkDayMapper;
import kg.megacom.salonservice.models.dto.MasterDto;
import kg.megacom.salonservice.models.dto.MasterWorkDayDto;
import kg.megacom.salonservice.models.entity.MasterWorkDay;
import kg.megacom.salonservice.services.MasterWorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MasterWorkDayServiceImpl implements MasterWorkDayService {

    @Autowired
    private MasterWorkDayRepo masterWorkDayRepo;

    @Override
    public MasterWorkDayDto save(MasterWorkDayDto masterWorkDayDto) {
        return MasterWorkDayMapper.INSTANCE.toDto(MasterWorkDayMapper.INSTANCE.toEntity(masterWorkDayDto));
    }

    @Override
    public List<MasterWorkDayDto> findAll() {
        List<MasterWorkDay> masterWorkDays = masterWorkDayRepo.findAll();
        List<MasterWorkDayDto> masterWorkDayDtos = masterWorkDays
                .stream()
                .map(x -> MasterWorkDayMapper.INSTANCE.toDto(x))
                .collect(Collectors.toList());
        return masterWorkDayDtos;
    }

    @Override
    public MasterWorkDayDto findById(Long id) {
        MasterWorkDay masterWorkDay = masterWorkDayRepo.findById(id)
                .orElseThrow(() -> new NotFound("Мастер не найден!"));
        return MasterWorkDayMapper.INSTANCE.toDto(masterWorkDay);
    }

    @Override
    public List<MasterWorkDayDto> findByMaster(Long id) {
     return MasterWorkDayMapper.INSTANCE.toDtos(masterWorkDayRepo.findAllByMasterId(id));
    }


}
