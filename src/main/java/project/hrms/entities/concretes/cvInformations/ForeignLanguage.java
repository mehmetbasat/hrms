package project.hrms.entities.concretes.cvInformations;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.hrms.entities.concretes.Candidate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "foreign_languages")
public class ForeignLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "language")
    private String language;

    @Column(name = "level")
    private byte level;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
