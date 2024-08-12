package project.hrms.api.controllers.cvInformationControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.cvInformationServices.AdressService;

import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.Address;


@RestController
@RequestMapping("/api/adress")
public class AdressController {

    private AdressService adressService;

    @Autowired
    public AdressController(AdressService adressService) {
        this.adressService = adressService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Address address) {
        return this.adressService.add(address);
    }
}

