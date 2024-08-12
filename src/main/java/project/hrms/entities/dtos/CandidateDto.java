package project.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDto {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private String birthYear;
    private String schoolName;
    private String departmentName;
    private Date startDate;
    private Date endDate;
    private String companyName;
    private String position;
    private Date jobStartDate;
    private Date jobEndDate;
    private String languageName;
    private byte languageLevel;
    private String imagePath;
    private String githubLink;
    private String linkedinLink;
    private String skill;
    private String coverLetter;

}
