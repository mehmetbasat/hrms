package project.hrms.api.controllers.cvInformationControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.cvInformationServices.AdressService;
import project.hrms.business.abstracts.cvInformationServices.SkillService;
import project.hrms.core.utilities.results.Result;

import project.hrms.entities.concretes.cvInformations.Skill;


@RestController
@RequestMapping("/api/skill")
public class SkillController {

    private SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Skill skill) {
        return this.skillService.add(skill);
    }
}

