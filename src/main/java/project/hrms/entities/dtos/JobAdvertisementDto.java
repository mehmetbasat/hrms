package project.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementDto {
    private int freePositionAmount;
    private Date startDate;
    private Date endDate;
    private String title;
    private String companyName;
}
