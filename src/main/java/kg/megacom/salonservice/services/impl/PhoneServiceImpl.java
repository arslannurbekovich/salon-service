package kg.megacom.salonservice.services.impl;

import kg.megacom.salonservice.dao.PhoneRepo;
import kg.megacom.salonservice.mappers.PhoneMapper;
import kg.megacom.salonservice.models.dto.PhoneDto;
import kg.megacom.salonservice.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneRepo phoneRepo;

    @Override
    public PhoneDto save(PhoneDto phoneDto) {
        return PhoneMapper.INSTANCE.toDto(phoneRepo.save(PhoneMapper.INSTANCE.toEntity(phoneDto)));
    }

    @Override
    public List<PhoneDto> saveAll(List<PhoneDto> phoneDtos) {
        return PhoneMapper.INSTANCE.toDtos(phoneRepo.saveAll(PhoneMapper.INSTANCE.toEntities(phoneDtos)));
    }

}