package lk.ijse.absd.controller;


import lk.ijse.absd.dto.ItemDTO;
import lk.ijse.absd.dto.common.ResponseDTO;
import lk.ijse.absd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemService itemService;




    @PostMapping
    public ResponseDTO addItem(@RequestBody ItemDTO dineDTO){
        long id=0;
        String message=null;
        int status=0;
        try {

            id=itemService.add(dineDTO);
            message="item create";
            status=200;

        }catch (Exception e){
            message="item create fail";
            status=400;

        }
        return new ResponseDTO(id,status,message);
    }

    @GetMapping
    public List<ItemDTO> getRest() {
        return itemService.getAll();
    }



}
