package project.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import project.hrms.core.entities.User;
import project.hrms.entities.concretes.cvInformations.*;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","educations","experiences","addresses","coverLetter","languages","images","skills"})

public class Candidate extends User {

    @NotNull(message = "Name cannot be null.")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "Surname cannot be null.")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "Nationality id cannot be null.")
    @Column(name = "nationality_id")
    private String nationalityId;

    @NotNull(message = "Birth year cannot be null.")
    @Column(name = "birth_year")
    private String birthYear;

    @OneToMany(mappedBy = "candidate")
    private List<Education> educations;

    @OneToMany(mappedBy = "candidate")
    private List<Experience> experiences;

    @OneToOne(mappedBy = "candidate")
    private CoverLetter coverLetter;

    @OneToMany(mappedBy = "candidate")
    private List<ForeignLanguage> languages;

    @OneToMany(mappedBy = "candidate")
    private List<Image> images;

    @OneToMany(mappedBy = "candidate")
    private List<Skill> skills;

    @OneToOne(mappedBy = "candidate")
    private Address addresses;




}
