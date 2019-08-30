package lk.ijse.absd.controller;


import lk.ijse.absd.dto.CustomerDTO;
import lk.ijse.absd.dto.common.ResponseDTO;
import lk.ijse.absd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerDTO> getRest(){
        return customerService.getAll();
    }

    @PostMapping
    public ResponseDTO addCustomer(@RequestBody CustomerDTO customerDTO){
        long id=0;
        String message=null;
        int status=0;
        try {

            id=customerService.add(customerDTO);
            message="customer create";
            status=200;

        }catch (Exception e){
            message="Customer create fail";
            status=400;

        }
        return new ResponseDTO(id,status,message);
    }

    @PutMapping
    public ResponseDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        long id=0;
        String message=null;
        int status=0;
        try {

            id=customerService.add(customerDTO);
            message="customer update";
            status=200;

        }catch (Exception e){
            message="Customer update fail";
            status=400;

        }
        return new ResponseDTO(id,status,message);
    }

    @DeleteMapping("/{id}")
    public long deleteCustomer(@PathVariable("id") Long id){
        return customerService.delete(id);
    }
}
