package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.EmployerCheckService;
import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.entities.concretes.Employer;

@Service
public class EmployerCheckManager implements EmployerCheckService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerCheckManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public boolean checkMailExists(Employer employer) {
        if (employerDao.findByMail(employer.getMail()).isPresent()) {
            return false;
        }

        return true;
    }

    @Override
    public boolean checkWebMail(Employer employer) {
        if (!employer.getMail().contains(employer.getWebSite())) {
            return false;
        }

        return true;
    }
}
