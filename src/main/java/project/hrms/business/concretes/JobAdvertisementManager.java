package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobAdvertisementService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobAdvertisementDao;
import project.hrms.dataAccess.abstracts.JobDao;
import project.hrms.entities.concretes.JobAdvertisement;
import project.hrms.entities.dtos.JobAdvertisementDto;

import java.util.Date;
import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {


    private final JobDao jobDao;
    private JobAdvertisementDao jobAdvertisementDao;


    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao, JobDao jobDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
        this.jobDao = jobDao;

    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {


        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("Job advertisement added");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<>(jobAdvertisementDao.findAll(),"Job advertisement list");
    }

    @Override
    public DataResult<List<JobAdvertisementDto>> getAllEndDateAsc() {
        return new SuccessDataResult<>(jobAdvertisementDao.getAllOrderByEndDateAsc());
    }

    @Override
    public DataResult<List<JobAdvertisementDto>> getAllEndDateDesc() {
        return new SuccessDataResult<>(jobAdvertisementDao.getAllOrderByEndDateDesc());
    }


    @Override
    public DataResult<List<JobAdvertisementDto>> getByJobName(String jobName) {
        return new SuccessDataResult<>(jobAdvertisementDao.getByJobName(jobName));
    }

    @Override
    public DataResult<List<JobAdvertisementDto>> getByJobAdvertisementByStatusTrue() {
        return new SuccessDataResult<>(jobAdvertisementDao.getByJobAdvertisementByStatusTrue());
    }

    @Override
    public DataResult<List<JobAdvertisementDto>> getByCompanyName(String companyName) {
        return new SuccessDataResult<>(jobAdvertisementDao.getByCompanyName(companyName));
    }

    @Override
    public Result update(int id) {
        jobAdvertisementDao.updateJobAdvertisementStatus(id);
        return new SuccessResult("Job advertisement updated");
    }

}
