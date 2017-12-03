package hu.elte.alkfejl.familytodolist.api;

import hu.elte.alkfejl.familytodolist.app.model.User;
import hu.elte.alkfejl.familytodolist.app.model.User.Role;
import hu.elte.alkfejl.familytodolist.service.UserService;
import hu.elte.alkfejl.familytodolist.service.exceptions.UserNotValidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hu.elte.alkfejl.familytodolist.service.annotations.*;

@RestController
@RequestMapping("/api/user")
public class UserApiController {
    private final UserService userService;
    
    @Autowired
    public UserApiController(UserService userService){
        this.userService = userService;
    }
    
    //@Role({USER, ADMIN})
    @GetMapping
    public ResponseEntity<User> user(){
        if(userService.isLoggedIn()){
            return ResponseEntity.ok(userService.getUser());
        }
        return ResponseEntity.badRequest().build();
    }
    
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user){
        try{
            return ResponseEntity.ok(userService.login(user));
        }
        catch(UserNotValidException e){
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/logout")
    public ResponseEntity logout(@RequestBody User user){
        this.userService.setUser(null);
        return ResponseEntity.ok().build();
    }
    
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user){
        return ResponseEntity.ok(userService.register(user));
    }
}
