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
    
    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private Role role;
 
    public Role getRole(){
        return role;
    }
    
    public enum Role{
        GUEST, USER, ADMIN
    }
}
