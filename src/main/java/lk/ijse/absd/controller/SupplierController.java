package lk.ijse.absd.controller;

import lk.ijse.absd.dto.SupplierDTO;
import lk.ijse.absd.dto.common.ResponseDTO;
import lk.ijse.absd.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
@CrossOrigin
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping
    public ResponseDTO addSupplier(@RequestBody SupplierDTO supplierDTO){
        long id=0;
        String message=null;
        int status=0;
        try {

            id=supplierService.add(supplierDTO);
            message="supplier create";
            status=200;

        }catch (Exception e){
            message="supplier create fail";
            status=400;

        }
        return new ResponseDTO(id,status,message);
    }

    @GetMapping
    public List<SupplierDTO> getRest(){
        return supplierService.getAll();
    }

}
