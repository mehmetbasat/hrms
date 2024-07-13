package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.Candidate;

import java.util.Optional;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

    Optional<Candidate> findByMail(String mail);
    Optional <Candidate> findByNationalityId(String nationalityId);

}
