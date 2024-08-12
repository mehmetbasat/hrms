package project.hrms.dataAccess.abstracts.cvInformationDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.cvInformations.ForeignLanguage;

public interface ForeignLangugaeDao extends JpaRepository<ForeignLanguage, Integer> {
}
