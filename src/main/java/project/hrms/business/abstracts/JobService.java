package project.hrms.business.abstracts;

import project.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    void add(Job job);
    List<Job> getAll();
}
