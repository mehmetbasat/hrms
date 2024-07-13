package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.JobService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Job;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/getall")
    public DataResult<List<Job>> getAll() {
        return this.jobService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Job job) {
        return jobService.add(job);
    }

}
