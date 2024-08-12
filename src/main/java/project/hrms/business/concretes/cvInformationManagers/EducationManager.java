package project.hrms.business.concretes.cvInformationManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.cvInformationServices.EducationService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.cvInformationDaos.EducationDao;
import project.hrms.entities.concretes.cvInformations.Education;

import java.util.List;

@Service
public class EducationManager implements EducationService {

    private EducationDao educationDao;

    @Autowired
    public EducationManager(EducationDao educationDao) {
        this.educationDao = educationDao;
    }

    @Override
    public Result add(Education education) {
        educationDao.save(education);
        return new SuccessResult("Education added successfully.");
    }

    @Override
    public DataResult<List<Education>> getAll() {
        return new SuccessDataResult<>(this.educationDao.findAll());
    }

    @Override
    public DataResult<List<Education>> getAllEducationSort() {
        return new SuccessDataResult<>(educationDao.getAllEducation(), "Data successfully retrieved.");
    }
}
