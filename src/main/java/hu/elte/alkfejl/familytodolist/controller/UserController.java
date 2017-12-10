package hu.elte.alkfejl.familytodolist.controller;
import hu.elte.alkfejl.familytodolist.app.model.User;
import hu.elte.alkfejl.familytodolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static hu.elte.alkfejl.familytodolist.app.model.User.Role.USER;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/tasklist")
    public String taskList(@RequestParam(value = "name", required = true) String name, Model model){
        model.addAttribute("name", name);
        return "tasklist";
    }
    
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute(new User());
        return "login";
    }
    
    @PostMapping
    public String login(@ModelAttribute User user, Model model){
        if(userService.isValid(user)){
            return redirectToTaskList(user);
        }
        model.addAttribute("loginFailed", true);
        return "login";
    }
    
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
    
    @PostMapping("/register")
    public String register(@ModelAttribute User user){
        user.setRole(USER);
        userService.register(user);
        
        return redirectToTaskList(user);
    }
    
    public String redirectToTaskList(@ModelAttribute User user){
        return "redirect:/user/tasklist?name=" + user.getUsername();
    }
}