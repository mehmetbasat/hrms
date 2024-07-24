package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobAdvertisement;
import project.hrms.entities.dtos.JobAdvertisementDto;

import java.util.Date;
import java.util.List;

public interface JobAdvertisementService {
    Result add(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisementDto>> getAllEndDateAsc();
    DataResult<List<JobAdvertisementDto>> getAllEndDateDesc();
    DataResult<List<JobAdvertisementDto>> getByJobName(String jobName);
    DataResult<List<JobAdvertisementDto>> getByJobAdvertisementByStatusTrue();
    DataResult<List<JobAdvertisementDto>> getByCompanyName(String companyName);

    Result update(int id);

}
