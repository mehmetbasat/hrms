package project.hrms.api.controllers.cvInformationControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.cvInformationServices.CoverLetterService;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.CoverLetter;



@RestController
@RequestMapping("/api/coverLetter")
public class CoverLetterController {

    private CoverLetterService coverLetterService;

    @Autowired
    public CoverLetterController(CoverLetterService coverLetterService) {
        this.coverLetterService = coverLetterService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CoverLetter coverLetter) {
        return this.coverLetterService.add(coverLetter);
    }
}

