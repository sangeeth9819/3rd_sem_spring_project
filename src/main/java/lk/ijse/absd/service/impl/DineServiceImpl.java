package lk.ijse.absd.service.impl;

import lk.ijse.absd.dto.DineDTO;
import lk.ijse.absd.entity.Dine;
import lk.ijse.absd.repository.DineRepository;
import lk.ijse.absd.service.DineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DineServiceImpl implements DineService {

    @Autowired
    private DineRepository dineRepository;




    @Override
    public long add(DineDTO dineDTO) {
     Dine saved= dineRepository.save(new Dine(dineDTO.getName(),dineDTO.getType()));
        return  null!=saved?saved.getId():null;
    }

    @Override
    public long update(DineDTO dineDTO) {
        Dine saved= dineRepository.save(new Dine(dineDTO.getName(),dineDTO.getType()));
        return  null!=saved?saved.getId():null;
    }

    @Override
    public long delete(Long id) {
        Dine dine=dineRepository.getOne(id);
//        customer.setStatus(0);
        dineRepository.save(dine);
        return dine.getId();
    }

    @Override
    public List<DineDTO> getAll() {
        List<Dine> customers=dineRepository.findAll();
        return customers.stream().map(c->new DineDTO(c.getId(),c.getName(),c.getType())).collect(Collectors.toList());
    }
}
