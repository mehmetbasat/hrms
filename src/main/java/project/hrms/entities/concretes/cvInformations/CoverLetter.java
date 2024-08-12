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
@Table(name = "cover_letters")
public class CoverLetter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cover_letter")
    private String coverLetter;

    @OneToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
