package project.hrms.business.abstracts;

import project.hrms.entities.concretes.Job;

public interface JobCheckService {
    boolean checkJobTitleAlreadyExist(Job job);
}
