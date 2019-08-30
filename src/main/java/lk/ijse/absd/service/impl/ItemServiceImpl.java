package lk.ijse.absd.service.impl;

import lk.ijse.absd.builders.DtoBuilder;
import lk.ijse.absd.dto.ItemDTO;
import lk.ijse.absd.entity.Category;
import lk.ijse.absd.entity.Item;
import lk.ijse.absd.repository.CategoryRepository;
import lk.ijse.absd.repository.ItemRepository;
import lk.ijse.absd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private DtoBuilder dtoBuilder;

    @Override
    public long add(ItemDTO itemDTO) {

        System.out.println("//////////// "+itemDTO.getCat_id());
        Category category=categoryRepository.getOne(itemDTO.getCat_id());
        System.out.println("////// "+category.getId());
        Item item=new Item();
        item.setId(itemDTO.getId());
        item.setCategory(category);
        item.setName(itemDTO.getName());
        item.setPrice(itemDTO.getPrice());
        item.setQty(itemDTO.getQty());
        itemRepository.save(item);
        return item.getId();

       // Item saved=itemRepository.save(new Item(itemDTO.getName(),category.getId(),itemDTO.getPrice(),itemDTO.getQty()));
       // return  null!=saved?saved.getId():null;
    }

    @Override
    public long update(ItemDTO itemDTO) {
        return 0;
    }

    @Override
    public long delete(Long id) {
        return 0;
    }

    @Override
    public List<ItemDTO> getAll() {
        List <ItemDTO>itemLIst=new ArrayList<>();

        for (Item item:itemRepository.findAll()) {

            itemLIst.add(dtoBuilder.buildItemDto(item));

        }
        return itemLIst;
    }
}
