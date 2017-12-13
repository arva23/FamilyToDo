package hu.elte.alkfejl.familytodolist.app.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TASKS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Task extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String name;
    
    @Column(nullable = false, unique = true)
    private String description;
    
    @Column(nullable = false, unique = false)
    private int userId;
    
    @Column(nullable = false, unique = false)
    private int categoryId;
    
    @Column(nullable = false, unique = false)
    private int timeintervalId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = false)
    private Status status;
    
    public enum Status{
        INPROGRESS, DONE
    }
    
    public void setStatus(Status status){
        this.status = status;
    }
}
