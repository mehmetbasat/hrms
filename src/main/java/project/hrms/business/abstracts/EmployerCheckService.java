package project.hrms.business.abstracts;

import project.hrms.entities.concretes.Employer;

public interface EmployerCheckService {
    boolean checkMailExists(Employer employer);
    boolean checkWebMail(Employer employer);

}
