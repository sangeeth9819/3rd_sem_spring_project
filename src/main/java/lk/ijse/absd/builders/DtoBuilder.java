package lk.ijse.absd.builders;

import lk.ijse.absd.dto.CategoryDTO;
import lk.ijse.absd.dto.ItemDTO;
import lk.ijse.absd.entity.Category;
import lk.ijse.absd.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class DtoBuilder {




    public ItemDTO buildItemDto(Item item) {

        if(item== null){
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(item.getId());
        itemDTO.setName(item.getName());
        itemDTO.setPrice(item.getPrice());
        itemDTO.setQty(item.getQty());
        itemDTO.setCategory(buildCategoryDto(item.getCategory()));
        return  itemDTO;

    }


    public CategoryDTO buildCategoryDto(Category category) {

        if(category== null){
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());

        return categoryDTO;
    }
}
