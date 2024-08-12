package project.hrms.api.controllers.cvInformationControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.cvInformationServices.EducationService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.entities.concretes.cvInformations.Education;

import java.util.List;

@RestController
@RequestMapping("/api/education")
public class EducationController {
    private EducationService educationService;

    @Autowired
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Education education) {
        return this.educationService.add(education);
    }

    @GetMapping("/getAll")
    public DataResult<List<Education>> getAll() {
        return this.educationService.getAll();
    }

    @GetMapping("/geteducations")
    public DataResult<List<Education>> getEducations() {
        return this.educationService.getAllEducationSort();
    }
}
