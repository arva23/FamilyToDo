package hu.elte.alkfejl.familytodolist.controller;
import static hu.elte.alkfejl.familytodolist.app.model.User.Role.USER;
import hu.elte.alkfejl.familytodolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    
    
    
}
