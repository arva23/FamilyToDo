package hu.elte.alkfejl.familytodolist.service;

import hu.elte.alkfejl.familytodolist.app.model.User;
import hu.elte.alkfejl.familytodolist.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import static hu.elte.alkfejl.familytodolist.app.model.User.Role.USER;
import hu.elte.alkfejl.familytodolist.service.exceptions.UserNotValidException;
@Service
@SessionScope
@Data
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private User user;
    
    public User login(User user) throws UserNotValidException{
        if(isValid(user)){
            return this.user = userRepository.findByUsername(user.getUsername()).get();
        }
        throw new UserNotValidException();
    }
    
    public User register(User user){
        user.setRole(USER);
        this.user = userRepository.save(user);
        return user;
    }
    
    public boolean isValid(User user){
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword()).isPresent();
    }
    
    public boolean isLoggedIn(){
        return user != null;
    }
    
    public User getUser(){
        return user;
    }
}
