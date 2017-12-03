package hu.elte.alkfejl.familytodolist.service;

import hu.elte.alkfejl.familytodolist.app.model.Task;
import hu.elte.alkfejl.familytodolist.app.model.User;
import hu.elte.alkfejl.familytodolist.repository.TaskRepository;
import hu.elte.alkfejl.familytodolist.service.exceptions.TaskNotFoundException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    
    private Task task;
    
    public Iterable<Task> listByRole(User user){
        if(user == null){
            return taskRepository.findAll();
        }
        
        User.Role role = user.getRole();
        
        if(role.equals(User.Role.USER)){
            return taskRepository.findAllByUser(user);
        }else if(role.equals(User.Role.ADMIN)){
            return taskRepository.findAll();
        }
        return Collections.emptyList();
    }
    
    public Task create(Task task){
        task.setStatus(Task.Status.INPROGRESS);
        task.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        return taskRepository.save(task);
    }
    
    public Task read(int id){
        return taskRepository.findOne(id).get();
    }
    
    public Task update(int id, Task task){
        Task currentTask = taskRepository.findOne(id).get();
        currentTask.setStatus(task.getStatus());
        return taskRepository.save(currentTask);
    }
    
    public void delete(int id){
        taskRepository.delete(taskRepository.findOne(id).get());
    }
}