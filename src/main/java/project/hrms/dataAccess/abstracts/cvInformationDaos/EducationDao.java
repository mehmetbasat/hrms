package project.hrms.dataAccess.abstracts.cvInformationDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import project.hrms.entities.concretes.cvInformations.Education;

import java.util.List;

public interface EducationDao extends JpaRepository<Education,Integer> {
    @Query("FROM Education e ORDER BY e.endDate DESC")
    List<Education> getAllEducation();
}
