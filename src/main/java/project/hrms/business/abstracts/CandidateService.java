package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    Result add(Candidate candidate) throws Exception;
    DataResult<List<Candidate>> getAll();

}
