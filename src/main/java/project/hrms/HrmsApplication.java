package project.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.hrms.business.abstracts.JobService;
import project.hrms.business.concretes.JobManager;
import project.hrms.entities.concretes.Job;

@SpringBootApplication
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);

	}

}
