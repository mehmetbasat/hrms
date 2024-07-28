package project.hrms.api.controllers;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.JobAdvertisementService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.ErrorDataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.dataAccess.abstracts.JobAdvertisementDao;
import project.hrms.entities.concretes.JobAdvertisement;
import project.hrms.entities.dtos.JobAdvertisementDto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementController {


    private JobAdvertisementService jobAdvertisementService;


    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }


    @PostMapping("/add")
    public Result addJobAdvertisement(@RequestBody JobAdvertisement jobAdvertisement) {
        return jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("/getall")
    public DataResult<List<JobAdvertisement>> getAll() {
        return jobAdvertisementService.getAll();
    }

    @GetMapping("/getByJobName")
    public DataResult<List<JobAdvertisementDto>> getByJobName(@RequestParam String jobName) {
        return jobAdvertisementService.getByJobName(jobName);
    }

    @GetMapping("/getByJobAdvertisementByStatusTrue")
    public DataResult<List<JobAdvertisementDto>> getByJobAdvertisementByStatusTrue() {
        return jobAdvertisementService.getByJobAdvertisementByStatusTrue();
    }

    @GetMapping("/getAllEndDateAsc")
    public DataResult<List<JobAdvertisementDto>> getAllEndDateAsc() {
        return jobAdvertisementService.getAllEndDateAsc();
    }

    @GetMapping("/getAllEndDateDesc")
    public DataResult<List<JobAdvertisementDto>> getAllEndDateDesc() {
        return jobAdvertisementService.getAllEndDateDesc();
    }

    @GetMapping("/getByCompanyName")
    public DataResult<List<JobAdvertisementDto>> getByCompanyName(@RequestParam String companyName) {
        return jobAdvertisementService.getByCompanyName(companyName);
    }

    @PutMapping("/updateJobAdvertisementStatus")
    @Transactional
    public Result update(@RequestParam int id) {
        return jobAdvertisementService.update(id);
    }




}
