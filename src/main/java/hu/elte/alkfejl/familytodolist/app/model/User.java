package hu.elte.alkfejl.familytodolist.app.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class User extends BaseEntity {
    // two equalent names are not allowed
    @Column(nullable = false, unique = true)
    private String username;
    
    @Column(nullable = false, unique = true)
    private String first_name;
    
    @Column(nullable = false, unique = true)
    private String last_name;
    
    @Column(nullable = false, unique = true)
    private String password;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private Role role;
    
    private enum Role{
        USER, ADMIN
    }
}
