package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobService;
import project.hrms.dataAccess.abstracts.JobDao;
import project.hrms.entities.concretes.Job;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public void add(Job job) {
        jobDao.save(job);
    }

    @Override
    public List<Job> getAll() {
        return jobDao.findAll();
    }
}
