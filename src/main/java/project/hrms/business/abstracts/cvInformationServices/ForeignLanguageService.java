package project.hrms.business.abstracts.cvInformationServices;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.ForeignLanguage;

public interface ForeignLanguageService {
    Result add(ForeignLanguage foreignLanguage);
}
