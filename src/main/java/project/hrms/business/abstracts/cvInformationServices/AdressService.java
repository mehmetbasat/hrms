package project.hrms.business.abstracts.cvInformationServices;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.Address;

public interface AdressService {
    Result add(Address address);
}
