package project.hrms.dataAccess.abstracts.cvInformationDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.cvInformations.CoverLetter;

public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer> {
}
