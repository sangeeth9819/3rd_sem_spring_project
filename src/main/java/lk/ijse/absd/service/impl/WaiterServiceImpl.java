package lk.ijse.absd.service.impl;


import lk.ijse.absd.dto.WaiterDTO;
import lk.ijse.absd.entity.Waiter;
import lk.ijse.absd.repository.WaiterRepository;
import lk.ijse.absd.service.WaiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class WaiterServiceImpl implements WaiterService {

    @Autowired
    private WaiterRepository waiterRepository;

    @Override
    public long add(WaiterDTO waiterDTO) {
        Waiter saved= waiterRepository.save(new Waiter(waiterDTO.getWname(),waiterDTO.getNic(),waiterDTO.getContact()));
        return  null!=saved?saved.getWid():null;
    }

    @Override
    public long update(WaiterDTO waiterDTO) {
        return 0;
    }

    @Override
    public long delete(Long id) {
        return 0;
    }

    @Override
    public List<WaiterDTO> getAll() {
        List<Waiter> waiters=waiterRepository.findAll();
        return waiters.stream().map(c->new WaiterDTO(c.getWid(),c.getWname(),c.getContact(),c.getNic())).collect(Collectors.toList());
    }
}
