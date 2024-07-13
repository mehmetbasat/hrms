package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.EmployerCheckService;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utilities.results.*;
import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.entities.concretes.Employer;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private EmployerCheckService employerCheckService;
    @Autowired
    public EmployerManager(EmployerDao employerDao, EmployerCheckService employerCheckService) {
        this.employerDao = employerDao;
        this.employerCheckService = employerCheckService;
    }



    @Override
    public Result add(Employer employer) throws Exception {


        if (!employerCheckService.checkMailExists(employer)) {
            return new ErrorResult("Mail is already exist");
        } else if (!employerCheckService.checkWebMail(employer)) {
            return new ErrorResult("Mail has to be content your website");
        }

        employerDao.save(employer);

        return new SuccessResult("Employer added");
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(employerDao.findAll());
    }
}
