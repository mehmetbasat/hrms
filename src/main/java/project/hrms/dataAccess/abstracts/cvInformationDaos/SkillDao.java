package project.hrms.dataAccess.abstracts.cvInformationDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.cvInformations.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {
}
