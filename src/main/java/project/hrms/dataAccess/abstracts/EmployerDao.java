package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.Employer;

import java.util.Optional;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
    Optional<Employer> findByMail(String mail);
}
