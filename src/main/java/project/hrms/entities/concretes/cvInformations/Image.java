package project.hrms.entities.concretes.cvInformations;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.hrms.entities.concretes.Candidate;
import project.hrms.entities.concretes.cvInformations.enums.StorageType;

@Data
@Entity
@Table(name = "images")
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "storage_name")
    @Enumerated(EnumType.STRING)
    private StorageType storageName;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;


}
