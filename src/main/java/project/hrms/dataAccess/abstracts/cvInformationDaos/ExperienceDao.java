package project.hrms.dataAccess.abstracts.cvInformationDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.hrms.entities.concretes.cvInformations.Experience;

import java.util.List;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {
    @Query("FROM Experience e ORDER BY e.endDate DESC")
    List<Experience> getAllExperience();
}
