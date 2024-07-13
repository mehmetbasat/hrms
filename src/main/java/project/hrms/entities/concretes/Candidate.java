package project.hrms.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "id")
public class Candidate extends User {

    @NotNull(message = "Name cannot be null.")
    @Column(name = "first_name")
    String firstName;

    @NotNull(message = "Surname cannot be null.")
    @Column(name = "last_name")
    String lastName;

    @NotNull(message = "Nationality id cannot be null.")
    @Column(name = "nationality_id")
    String nationalityId;

    @NotNull(message = "Birth year cannot be null.")
    @Column(name = "birth_year")
    String birthYear;

}
