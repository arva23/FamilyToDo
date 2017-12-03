package hu.elte.alkfejl.familytodolist.repository;
// Data Access Layer

import hu.elte.alkfejl.familytodolist.app.model.Task;
import hu.elte.alkfejl.familytodolist.app.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, String>{
    Optional<Task> findByName(String name);
    
    //Optional<Task> findByUser(String user);
    
    Optional<Task> findByCategory(String category);
    
    Optional<Task> findByTime(String time);

    Iterable<Task> findAllByUser(User user);
    
    Optional<Task> findOne(int id);
}
