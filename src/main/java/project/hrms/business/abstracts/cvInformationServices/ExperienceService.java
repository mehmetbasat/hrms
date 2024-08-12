package project.hrms.business.abstracts.cvInformationServices;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.Experience;


import java.util.List;

public interface ExperienceService {
    Result add(Experience experience);
    DataResult<List<Experience>> getAll();
    DataResult<List<Experience>> getAllExperienceSort();
}
