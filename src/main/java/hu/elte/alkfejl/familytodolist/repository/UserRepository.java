package hu.elte.alkfejl.familytodolist.repository;

// Data Access Layer
import hu.elte.alkfejl.familytodolist.app.model.User;
import hu.elte.alkfejl.familytodolist.app.model.User.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findById(int id);
    
    Optional<User> findByUsername(String username);
    
    Iterable<User> findByRole(Role role);
    
    Optional<User> findByUsernameAndPassword(String username, String password);
}
