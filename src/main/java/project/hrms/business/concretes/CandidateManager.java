package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CandidateCheckService;
import project.hrms.business.abstracts.CandidateService;
import project.hrms.core.utilities.results.*;
import project.hrms.dataAccess.abstracts.CandidateDao;
import project.hrms.entities.concretes.Candidate;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    private CandidateCheckService candidateCheckService;


    @Autowired
    public CandidateManager(CandidateDao candidateDao, CandidateCheckService candidateCheckService) {
        this.candidateDao = candidateDao;
        this.candidateCheckService = candidateCheckService;

    }


    @Override
    public Result add(Candidate candidate) throws Exception {

        if (!candidateCheckService.checkIfRealPerson(candidate)) {
            return new ErrorResult("Not a real person");
        } else if(!candidateCheckService.checkMailExist(candidate)) {
            return new ErrorResult("Mail already exist");
        } else if(!candidateCheckService.checkNationalityIdExist(candidate)) {
            return new ErrorResult("Nationality Id already exist");
        }



        candidateDao.save(candidate);
        return new SuccessResult("Add Success");

    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<>(this.candidateDao.findAll());
    }
}
