package hu.elte.alkfejl.familytodolist.controller;

import hu.elte.alkfejl.familytodolist.app.model.Task;
import hu.elte.alkfejl.familytodolist.service.TaskService;
import hu.elte.alkfejl.familytodolist.service.UserService;
import hu.elte.alkfejl.familytodolist.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static hu.elte.alkfejl.familytodolist.app.model.User.Role.ADMIN;
import static hu.elte.alkfejl.familytodolist.app.model.User.Role.USER;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    
    @Autowired
    private TaskService taskService;
    
    @Autowired
    private UserService userService;
    
    @Role({ADMIN, USER})
    @GetMapping
    private ResponseEntity<Iterable<Task> > list(){
        Iterable<Task> tasks = taskService.listByRole(userService.getUser());
        return ResponseEntity.ok(tasks);
    }
    
    @Role({ADMIN, USER})
    @PostMapping
    private ResponseEntity<Task> create(@RequestBody Task task){
        Task saved = taskService.create(task);
        return ResponseEntity.ok(saved);
    }
    
    @Role({ADMIN, USER})
    @GetMapping("/{id}")
    private ResponseEntity<Task> read(@RequestParam String id){
        Task read = taskService.read(Integer.parseInt(id));
        return ResponseEntity.ok(read);
    }
    
    @Role(ADMIN)
    @PutMapping("/{id}")
    private ResponseEntity<Task> update(@PathVariable int id, @RequestBody Task task){
        Task updated = taskService.update(id, task);
        return ResponseEntity.ok(updated);
    }
    
    @Role(ADMIN)
    @DeleteMapping("/{id}")
    private ResponseEntity delete(@RequestParam int id){
        taskService.delete(id);
        return ResponseEntity.ok().build();
    }
    
}
