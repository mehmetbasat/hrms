package project.hrms.business.concretes.cvInformationManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.cvInformationServices.ExperienceService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.cvInformationDaos.ExperienceDao;
import project.hrms.entities.concretes.cvInformations.Experience;

import java.util.List;

@Service
public class ExperienceManager implements ExperienceService {

    private ExperienceDao experienceDao;

    @Autowired
    public ExperienceManager(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }

    @Override
    public Result add(Experience experience) {
        experienceDao.save(experience);
        return new SuccessResult("Experience added succesfully.");
    }

    @Override
    public DataResult<List<Experience>> getAll() {
        return new SuccessDataResult<>(experienceDao.findAll());
    }

    @Override
    public DataResult<List<Experience>> getAllExperienceSort() {
        return new SuccessDataResult<>(experienceDao.getAllExperience());
    }
}
