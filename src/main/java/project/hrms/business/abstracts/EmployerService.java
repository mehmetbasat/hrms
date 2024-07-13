package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    Result add(Employer employer) throws Exception;
    DataResult<List<Employer>> getAll();

}
