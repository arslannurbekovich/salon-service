package kg.megacom.salonservice.services.impl;

import kg.megacom.salonservice.dao.ReservedHourRepo;
import kg.megacom.salonservice.exceptions.NotFound;
import kg.megacom.salonservice.mappers.ReservedHourMapper;
import kg.megacom.salonservice.models.dto.ReservedHourDto;
import kg.megacom.salonservice.models.entity.MasterWorkDay;
import kg.megacom.salonservice.models.entity.ReservedHour;
import kg.megacom.salonservice.models.entity.StatusReserved;
import kg.megacom.salonservice.services.ClientService;
import kg.megacom.salonservice.services.MasterWorkDayService;
import kg.megacom.salonservice.services.ReservedHourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservedHourServiceImpl implements ReservedHourService {

    @Autowired
    private ReservedHourRepo reservedHourRepo;

    @Override
    public ReservedHourDto save(ReservedHourDto reservedHourDto) throws NotFound {

        return ReservedHourMapper.INSTANCE.toDto(reservedHourRepo.save(ReservedHourMapper.INSTANCE.toEntity(reservedHourDto)));
    }

    @Override
    public List<ReservedHourDto> findAll() {
        List<ReservedHour> reservedHours = reservedHourRepo.findAll();
        List<ReservedHourDto> reservedHourDtos = reservedHours
                .stream()
                .map(x -> ReservedHourMapper.INSTANCE.toDto(x))
                .collect(Collectors.toList());
        return reservedHourDtos;
    }

    @Override
    public ReservedHourDto findById(Long id) {
        ReservedHour reservedHour = reservedHourRepo.findById(id)
                .orElseThrow(() -> new NotFound("Заказ не найден!"));
        return ReservedHourMapper.INSTANCE.toDto(reservedHour);
    }

    @Override
    public ReservedHourDto update(ReservedHourDto reservedHourDto) {
        if (!reservedHourRepo.existsById(reservedHourDto.getId())) {
            throw new NotFound("Заказ не найден!");
        }
        return ReservedHourMapper.INSTANCE.toDto(reservedHourRepo.save(ReservedHourMapper.INSTANCE.toEntity(reservedHourDto)));
    }

    @Override
    public List<ReservedHourDto> findByMasterWorkDayId(Long id) {
        return ReservedHourMapper.INSTANCE.toDtos(reservedHourRepo.findAllByMasterWorkDayId(id));
    }


}
