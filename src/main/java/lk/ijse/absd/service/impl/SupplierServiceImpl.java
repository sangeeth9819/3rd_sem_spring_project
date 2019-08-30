package lk.ijse.absd.service.impl;

import lk.ijse.absd.dto.SupplierDTO;
import lk.ijse.absd.entity.Supplier;
import lk.ijse.absd.repository.SupplierRepository;
import lk.ijse.absd.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

   @Autowired
   private SupplierRepository supplierRepository;

    @Override
    public long add(SupplierDTO supplierDTO) {
        Supplier saved= supplierRepository.save(new Supplier(supplierDTO.getName(),supplierDTO.getCompany(),supplierDTO.getEmail(),supplierDTO.getContact(),supplierDTO.getAcno()));
        return  null!=saved?saved.getSid():null;
    }

    @Override
    public long update(SupplierDTO supplierDTO) {
        return 0;
    }

    @Override
    public long delete(Long id) {
        return 0;
    }

    @Override
    public List<SupplierDTO> getAll() {
        List<Supplier> suppliers=supplierRepository.findAll();
        return suppliers.stream().map(c->new SupplierDTO(c.getSid(),c.getName(),c.getCompany(),c.getEmail(),c.getContact(),c.getAcno())).collect(Collectors.toList());
    }
}
