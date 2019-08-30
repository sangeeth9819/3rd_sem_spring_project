package lk.ijse.absd.controller;


import lk.ijse.absd.dto.WaiterDTO;
import lk.ijse.absd.dto.common.ResponseDTO;
import lk.ijse.absd.service.WaiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/waiter")
@CrossOrigin
public class WaiterController {

    @Autowired
    private WaiterService waiterService;


    @PostMapping
    public ResponseDTO addWaiter(@RequestBody WaiterDTO waiterDTO){
        long id=0;
        String message=null;
        int status=0;
        try {

            id=waiterService.add(waiterDTO);
            message="waiter create";
            status=200;

        }catch (Exception e){
            message="waiter create fail";
            status=400;

        }
        return new ResponseDTO(id,status,message);
    }

    @GetMapping
    public List<WaiterDTO> getRest(){
        return waiterService.getAll();
    }
}
