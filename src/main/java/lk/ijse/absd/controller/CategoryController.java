package lk.ijse.absd.controller;



import lk.ijse.absd.dto.CategoryDTO;
import lk.ijse.absd.dto.common.ResponseDTO;
import lk.ijse.absd.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseDTO addDine(@RequestBody CategoryDTO categoryDTO){
        long id=0;
        String message=null;
        int status=0;
        try {

            id=categoryService.add(categoryDTO);
            message="category create";
            status=200;

        }catch (Exception e){
            message="category create fail";
            status=400;

        }
        return new ResponseDTO(id,status,message);
    }


    @GetMapping
    public List<CategoryDTO> getRest(){
        return categoryService.getAll();
    }
}
