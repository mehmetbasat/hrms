package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    Result add(Job job);
    DataResult<List<Job>> getAll();
}
