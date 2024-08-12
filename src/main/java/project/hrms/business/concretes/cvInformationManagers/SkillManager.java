package project.hrms.business.concretes.cvInformationManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.cvInformationServices.SkillService;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.cvInformationDaos.SkillDao;
import project.hrms.entities.concretes.cvInformations.Skill;

@Service
public class SkillManager implements SkillService {

    private SkillDao skillDao;

    @Autowired
    public SkillManager(SkillDao skillDao) {
        this.skillDao = skillDao;
    }

    @Override
    public Result add(Skill skill) {
        skillDao.save(skill);
        return new SuccessResult("Skill added successfully");
    }
}
