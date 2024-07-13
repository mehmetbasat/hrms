package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobCheckService;
import project.hrms.business.abstracts.JobService;
import project.hrms.core.utilities.results.*;
import project.hrms.dataAccess.abstracts.JobDao;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.Job;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;
    private JobCheckService jobCheckService;

    @Autowired
    public JobManager(JobDao jobDao, JobCheckService jobCheckService) {
        this.jobDao = jobDao;
        this.jobCheckService = jobCheckService;

    }

    @Override
    public Result add(Job job) {

        if (!jobCheckService.checkJobTitleAlreadyExist(job)) {
            return new ErrorResult("Job title already exist");
        }
         jobDao.save(job);
         return new SuccessResult("Job added");
    }

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<>(jobDao.findAll());
    }
}
