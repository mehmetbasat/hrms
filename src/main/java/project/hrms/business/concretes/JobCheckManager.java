package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobCheckService;
import project.hrms.dataAccess.abstracts.JobDao;
import project.hrms.entities.concretes.Job;

@Service
public class JobCheckManager implements JobCheckService {

    @Autowired
    private JobDao jobDao;

    @Override
    public boolean checkJobTitleAlreadyExist(Job job) {
        if (jobDao.findJobByName(job.getName()).isPresent()) {
            return false;
        }

        return true;
    }
}
