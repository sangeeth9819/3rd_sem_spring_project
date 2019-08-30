package lk.ijse.absd.service.impl;

import lk.ijse.absd.dto.CustomerDTO;
import lk.ijse.absd.entity.Customer;
import lk.ijse.absd.repository.CustomerRepository;
import lk.ijse.absd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

       @Override
    public long add(CustomerDTO customerDTO) {
       Customer saved=customerRepository.save(new Customer(customerDTO.getName(), customerDTO.getEmail(),customerDTO.getAddress(),customerDTO.getMobile()));
        return  null!=saved?saved.getId():null;
    }

    @Override
    public List<CustomerDTO> getAll() {
        List<Customer> customers=customerRepository.findAll();
        return customers.stream().map(c->new CustomerDTO(c.getId(),c.getName(), c.getEmail(),c.getAddress(),c.getMobile())).collect(Collectors.toList());
    }

    @Override
    public long update(CustomerDTO customerDTO) {
        Customer saved=customerRepository.save(new Customer(customerDTO.getName(), customerDTO.getEmail(),customerDTO.getAddress(),customerDTO.getMobile()));
        return  null!=saved?saved.getId():null;
    }

    @Override
    public long delete(Long id) {
//        customerRepository.deleteById(id);
//        return "Customer Deleted";
        Customer customer=customerRepository.getOne(id);
//        customer.setStatus(0);
        customerRepository.save(customer);
       return customer.getId();
    }
}
