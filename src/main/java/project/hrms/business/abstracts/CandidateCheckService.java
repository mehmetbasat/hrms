package project.hrms.business.abstracts;

import project.hrms.entities.concretes.Candidate;

public interface CandidateCheckService  {
    boolean checkIfRealPerson(Candidate candidate) throws Exception;
    boolean checkMailExist(Candidate candidate);
    boolean checkNationalityIdExist(Candidate candidate);


}
