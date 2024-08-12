package project.hrms.dataAccess.abstracts.cvInformationDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.hrms.entities.concretes.cvInformations.Image;

import java.util.List;
import java.util.UUID;

@Repository
public interface ImageDao extends JpaRepository<Image, Integer> {
    List<Image> getByCandidate_Id(int id);

}
