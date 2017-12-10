package hu.elte.alkfejl.familytodolist.repository;
// Data Access Layer

import hu.elte.alkfejl.familytodolist.app.model.Task;
import hu.elte.alkfejl.familytodolist.app.model.Task.Status;
import java.sql.Timestamp;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, String>{
    //Optional<Task> findByName(String name);
    
    //Optional<Task> findByUser(String user);
    
    //Optional<Task> findByCategory(Category category);
    
    //Optional<Task> findByTimeInterval(TimeInterval time);

    //Iterable<Task> findAllByUser(User user);
    
    Optional<Task> findById(int id);

    Optional<Task> findByName(String name);
    
    Iterable<Task> findAllByUserId(int userId);
    
    Iterable<Task> findAllByCategoryId(int categoryId);
    
    Iterable<Task> findAllByTimeintervalId(int timeintervalId);
    
    Iterable<Task> findAllByStatus(Status status);
    
    Iterable<Task> findAllByFinished(Timestamp finished);
}
