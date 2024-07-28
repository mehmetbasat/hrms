package project.hrms.core.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Email
    @NotBlank(message = "Email cannot contain spaces")
    @Column(name = "mail")
    String mail;

    @NotNull(message = "Password cannot be null")
    @Column(name = "password")
    String password;


    @NotNull(message = "Password cannot be null")
    @Column(name = "password_repeat")
    String password_again;

}
