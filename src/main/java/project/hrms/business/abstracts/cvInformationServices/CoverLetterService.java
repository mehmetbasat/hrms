package project.hrms.business.abstracts.cvInformationServices;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.CoverLetter;

public interface CoverLetterService {
    Result add(CoverLetter coverLetter);
}
