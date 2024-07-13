package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.Job;

import java.util.Optional;

public interface JobDao extends JpaRepository<Job, Integer> {
    Optional<Job> findJobByName(String title);
}
