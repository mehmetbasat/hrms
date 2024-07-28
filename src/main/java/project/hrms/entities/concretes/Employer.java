package project.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.hrms.core.entities.User;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employers" )

public class Employer extends User {

    @NotNull(message = "Company name cannot be null.")
    @Column(name = "company_name")
    private String companyName;

    @NotNull(message = "Website cannot be null.")
    @Column(name = "website")
    private String webSite;

    @NotNull(message = "Phone number cannot be null.")
    @Column(name = "phone_number")
    private String phoneNumber;



}
