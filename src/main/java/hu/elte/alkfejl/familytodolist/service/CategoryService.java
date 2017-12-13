package hu.elte.alkfejl.familytodolist.service;

import hu.elte.alkfejl.familytodolist.app.model.Category;
import hu.elte.alkfejl.familytodolist.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    private Category category;
    
    //public Iterable<Category> listByName(S);
}
