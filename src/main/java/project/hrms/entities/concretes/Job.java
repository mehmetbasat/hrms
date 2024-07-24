package project.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "job_titles")
@AllArgsConstructor
@NoArgsConstructor

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "job_title")
    String name;

    @OneToMany(mappedBy = "job")
    private List<JobAdvertisement> jobAdvertisements;

}
