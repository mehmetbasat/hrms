package project.hrms.business.concretes.cvInformationManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.cvInformationServices.AdressService;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.cvInformationDaos.AddressDao;
import project.hrms.entities.concretes.cvInformations.Address;

@Service
public class AdressManager implements AdressService {

    private AddressDao addressDao;

    @Autowired
    public AdressManager(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Override
    public Result add(Address address) {
        if (!address.getGithubAdress().contains("github.com")) {
            return new ErrorResult("Please enter your github adress.");
        } else if (!address.getLinkedinAdress().contains("linkedin.com")) {
            return new ErrorResult("Please enter your linkedin adress.");
        }

        addressDao.save(address);
        return new SuccessResult("Adress added successfully.");
    }
}
