package project.hrms.business.concretes.cvInformationManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.cvInformationServices.ForeignLanguageService;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.cvInformationDaos.ForeignLangugaeDao;
import project.hrms.entities.concretes.cvInformations.ForeignLanguage;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {

    private ForeignLangugaeDao foreignLangugaeDao;

    @Autowired
    public ForeignLanguageManager(ForeignLangugaeDao foreignLangugaeDao) {
        this.foreignLangugaeDao = foreignLangugaeDao;
    }

    @Override
    public Result add(ForeignLanguage foreignLanguage) {
        if (foreignLanguage.getLevel() <= 5) {
            foreignLangugaeDao.save(foreignLanguage);
            return new SuccessResult("Language added successfully");
        } else {
            return new ErrorResult("Language level has to be 1 - 5");
        }

    }
}
