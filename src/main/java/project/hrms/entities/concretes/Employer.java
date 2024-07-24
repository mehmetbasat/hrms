package project.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "employers" )
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
@EqualsAndHashCode(callSuper=true)
public class Employer extends User {

    @NotNull(message = "Company name cannot be null.")
    @Column(name = "company_name")
    String companyName;

    @NotNull(message = "Website cannot be null.")
    @Column(name = "website")
    String webSite;

    @NotNull(message = "Phone number cannot be null.")
    @Column(name = "phone_number")
    String phoneNumber;

    @OneToMany(mappedBy = "employer")
    List<JobAdvertisement> jobAdvertisements;

}
