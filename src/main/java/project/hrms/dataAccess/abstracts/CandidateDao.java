package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.hrms.entities.concretes.Candidate;
import project.hrms.entities.dtos.CandidateDto;

import java.util.List;
import java.util.Optional;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

    Optional<Candidate> findByMail(String mail);

    Optional<Candidate> findByNationalityId(String nationalityId);

    @Query("SELECT NEW project.hrms.entities.dtos.CandidateDto" +
            "(c.id, c.firstName, c.lastName, c.nationalityId, c.birthYear," +
            "ed.schoolName, ed.department, ed.startDate, ed.endDate," +
            "ex.companyName, ex.position, ex.startDate, ex.endDate," +
            "l.language, l.level," +
            "i.imagePath," +
            "ad.githubAdress, ad.linkedinAdress," +
            "s.skillName," +
            "cl.coverLetter)"+
            " FROM Candidate c" +
            " JOIN c.educations ed " +
            " JOIN c.experiences ex" +
            " JOIN c.languages l" +
            " JOIN c.addresses ad" +
            " JOIN c.images i" +
            " JOIN c.skills s" +
            " JOIN c.coverLetter cl where c.id =:id ")
    CandidateDto getCandidateCvById(int id);

}
