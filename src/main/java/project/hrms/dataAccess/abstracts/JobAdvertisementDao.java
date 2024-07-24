package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import project.hrms.entities.concretes.JobAdvertisement;
import project.hrms.entities.dtos.JobAdvertisementDto;


import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    @Query("SELECT NEW project.hrms.entities.dtos.JobAdvertisementDto(j.freePositionAmount, j.startDate, j.endDate, p.name, e.companyName) FROM JobAdvertisement j JOIN j.job p JOIN j.employer e where p.name =:jobName ")
    List<JobAdvertisementDto> getByJobName(String jobName);

    @Query("SELECT NEW project.hrms.entities.dtos.JobAdvertisementDto(j.freePositionAmount, j.startDate, j.endDate, p.name, e.companyName) FROM JobAdvertisement j JOIN j.job p JOIN j.employer e WHERE j.status = true ORDER BY j.endDate ASC")
    List<JobAdvertisementDto> getAllOrderByEndDateAsc();

    @Query("SELECT NEW project.hrms.entities.dtos.JobAdvertisementDto(j.freePositionAmount, j.startDate, j.endDate, p.name, e.companyName) FROM JobAdvertisement j JOIN j.job p JOIN j.employer e where j.status = true ORDER BY j.endDate DESC")
    List<JobAdvertisementDto> getAllOrderByEndDateDesc();

    @Query("SELECT NEW project.hrms.entities.dtos.JobAdvertisementDto(j.freePositionAmount, j.startDate, j.endDate, p.name, e.companyName) FROM JobAdvertisement j JOIN j.job p JOIN j.employer e where j.status = true")
    List<JobAdvertisementDto> getByJobAdvertisementByStatusTrue();

    @Query("SELECT NEW project.hrms.entities.dtos.JobAdvertisementDto(j.freePositionAmount, j.startDate, j.endDate, p.name, e.companyName) FROM JobAdvertisement j JOIN j.job p JOIN j.employer e where j.status = true AND j.employer.companyName =:companyName")
    List<JobAdvertisementDto> getByCompanyName(String companyName);

    @Modifying
    @Query("UPDATE JobAdvertisement j set j.status = false where j.id =:id")
    void updateJobAdvertisementStatus(int id);




}
