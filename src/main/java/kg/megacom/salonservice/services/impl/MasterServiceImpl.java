package kg.megacom.salonservice.services.impl;

import kg.megacom.salonservice.dao.MasterRepo;
import kg.megacom.salonservice.exceptions.NotFound;
import kg.megacom.salonservice.mappers.MasterMapper;
import kg.megacom.salonservice.models.dto.MasterDto;
import kg.megacom.salonservice.models.entity.Master;
import kg.megacom.salonservice.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterServiceImpl implements MasterService {

    @Autowired
    private MasterRepo masterRepo;

    @Override
    public MasterDto save(MasterDto masterDto) {
            return MasterMapper.INSTANCE.toDto(masterRepo.save(MasterMapper.INSTANCE.toEntity(masterDto)));
    }

    @Override
    public MasterDto update(MasterDto masterDto) {
            if(!masterRepo.existsById(masterDto.getId())){
                throw new NotFound("Мастер не найден!");
            }
            return MasterMapper.INSTANCE.toDto(masterRepo.save(MasterMapper.INSTANCE.toEntity(masterDto)));
    }

    @Override
    public List<MasterDto> findAll() {
        List<Master> masters = masterRepo.findAll();
        return MasterMapper.INSTANCE.toDtos(masters);
    }

    @Override
    public MasterDto findById(Long id) {
        Master master = masterRepo.findById(id)
                .orElseThrow(() -> new NotFound("Мастер не найден!"));
        return MasterMapper.INSTANCE.toDto(master);
    }

}
