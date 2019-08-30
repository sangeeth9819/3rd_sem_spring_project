package lk.ijse.absd.service.impl;

import lk.ijse.absd.dto.CategoryDTO;
import lk.ijse.absd.entity.Category;
import lk.ijse.absd.repository.CategoryRepository;
import lk.ijse.absd.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public long add(CategoryDTO categoryDTO) {
        Category saved=categoryRepository.save(new Category(categoryDTO.getName()));
        return  null!=saved?saved.getId():null;
    }

    @Override
    public long update(CategoryDTO categoryDTO) {
        return 0;
    }

    @Override
    public long delete(Long id) {
        return 0;
    }

    @Override
    public List<CategoryDTO> getAll() {
        List<Category> customers=categoryRepository.findAll();
        return customers.stream().map(c->new CategoryDTO(c.getId(),c.getName())).collect(Collectors.toList());
    }
}
