package project.hrms.entities.concretes.cvInformations;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.hrms.entities.concretes.Candidate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "github_adress")
    private String githubAdress;

    @Column(name = "linkedin_adress")
    private String linkedinAdress;

    @OneToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

}
