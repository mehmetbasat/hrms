package project.hrms.entities.concretes;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "employers" )
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

}
