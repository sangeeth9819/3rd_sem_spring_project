package lk.ijse.absd.controller;

import lk.ijse.absd.dto.DineDTO;
import lk.ijse.absd.dto.common.ResponseDTO;
import lk.ijse.absd.service.DineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dine")
@CrossOrigin
public class DineController {

    @Autowired
    private DineService dineService;

    @PostMapping
    public ResponseDTO addDine(@RequestBody DineDTO dineDTO){
        long id=0;
        String message=null;
        int status=0;
        try {

            id=dineService.add(dineDTO);
            message="dine create";
            status=200;

        }catch (Exception e){
            message="dine create fail";
            status=400;

        }
        return new ResponseDTO(id,status,message);
    }

    @GetMapping
    public List<DineDTO> getRest() {
        return dineService.getAll();
    }

}
