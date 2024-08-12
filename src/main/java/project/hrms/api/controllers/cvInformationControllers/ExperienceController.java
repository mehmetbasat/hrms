package project.hrms.api.controllers.cvInformationControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.cvInformationServices.ExperienceService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.Education;
import project.hrms.entities.concretes.cvInformations.Experience;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

    private ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Experience experience) {
        return this.experienceService.add(experience);
    }

    @GetMapping("/getAll")
    public DataResult<List<Experience>> getAll() {
        return this.experienceService.getAll();
    }

    @GetMapping("/getexperiences")
    public DataResult<List<Experience>> getEducations() {
        return this.experienceService.getAllExperienceSort();
    }
}
