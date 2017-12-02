package hu.elte.alkfejl.familytodolist.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CATEGORIES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Categories extends BaseEntity{
    @Column(nullable = false, unique = false)
    private String name;
    
    @Column(nullable = false, unique = false)
    private String description;
}
