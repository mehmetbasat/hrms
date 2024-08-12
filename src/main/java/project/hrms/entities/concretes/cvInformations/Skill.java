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
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "skill_name")
    private String skillName;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
