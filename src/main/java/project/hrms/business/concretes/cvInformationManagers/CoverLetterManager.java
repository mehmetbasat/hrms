package project.hrms.business.concretes.cvInformationManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.cvInformationServices.CoverLetterService;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.cvInformationDaos.CoverLetterDao;
import project.hrms.entities.concretes.cvInformations.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService {

    private CoverLetterDao coverLetterDao;

    @Autowired
    public CoverLetterManager(CoverLetterDao coverLetterDao) {
        this.coverLetterDao = coverLetterDao;
    }

    @Override
    public Result add(CoverLetter coverLetter) {
        coverLetterDao.save(coverLetter);
        return new SuccessResult("Cover letter added successfully");
    }
}
