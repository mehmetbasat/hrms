package project.hrms.business.abstracts.cvInformationServices;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.Education;

import java.util.List;

public interface EducationService {
    Result add(Education education);
    DataResult<List<Education>> getAll();
    DataResult<List<Education>> getAllEducationSort();
}
