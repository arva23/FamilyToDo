package hu.elte.alkfejl.familytodolist.repository;

import hu.elte.alkfejl.familytodolist.app.model.Category;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {
    Optional<Category> findById(int id);
    
    Optional<Category> findByName(String name);
    
    Optional<Category> findByDescription(String description);
}
