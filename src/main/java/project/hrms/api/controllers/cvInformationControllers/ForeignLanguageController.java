package project.hrms.api.controllers.cvInformationControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.cvInformationServices.ForeignLanguageService;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignlanguage")
public class ForeignLanguageController {

    private ForeignLanguageService foreignLanguageService;

    @Autowired
    public ForeignLanguageController(ForeignLanguageService foreignLanguageService) {
        this.foreignLanguageService = foreignLanguageService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody ForeignLanguage foreignLanguage) {
        return this.foreignLanguageService.add(foreignLanguage);
    }

}
