package project.hrms.dataAccess.abstracts.cvInformationDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.cvInformations.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {
}
