package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CandidateCheckService;
import project.hrms.core.adapters.MernisServiceAdapter;
import project.hrms.dataAccess.abstracts.CandidateDao;
import project.hrms.entities.concretes.Candidate;

@Service
public class CandidateCheckManager implements CandidateCheckService {

    private CandidateDao candidateDao;
    private MernisServiceAdapter mernisServiceAdapter;

    @Autowired
    public CandidateCheckManager(CandidateDao candidateDao, MernisServiceAdapter mernisServiceAdapter) {
        this.candidateDao = candidateDao;
        this.mernisServiceAdapter = mernisServiceAdapter;
    }

    @Override
    public boolean checkIfRealPerson(Candidate candidate) throws Exception {
       if (mernisServiceAdapter.CheckIfRealPerson(candidate)) {
           return true;
       }

       return false;
    }

    @Override
    public boolean checkMailExist(Candidate candidate) {

        if (candidateDao.findByMail(candidate.getMail()).isPresent()) {
            return false;
        }

        return true;

    }

    @Override
    public boolean checkNationalityIdExist(Candidate candidate) {
        if (candidateDao.findByNationalityId(candidate.getNationalityId()).isPresent()) {
            return false;
        }

        return true;

    }


}
