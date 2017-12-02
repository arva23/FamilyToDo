package hu.elte.alkfejl.familytodolist.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TIMEINTERVALS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TimeIntervals extends BaseEntity{
    @Column(nullable = false, unique = false)
    private String start_time;
    
    @Column(nullable = false, unique = false)
    private String termination_time;
}
