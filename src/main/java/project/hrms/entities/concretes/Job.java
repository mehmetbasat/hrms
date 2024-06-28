package project.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "job_titles")

public class Job {

    @Id
    @GeneratedValue
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    public Job() {

    }

    public Job(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
