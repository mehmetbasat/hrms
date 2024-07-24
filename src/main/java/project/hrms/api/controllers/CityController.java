package project.hrms.api.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.CandidateService;
import project.hrms.business.abstracts.CityService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Candidate;
import project.hrms.entities.concretes.City;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {

    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    // @GetMapping("/getall")
    //public DataResult<List<Candidate>> getAll() {
    //  return cityService.getAll();


    @PostMapping("/add")
    public Result add(@Valid @RequestBody City city) throws Exception {
        return cityService.add(city);
    }

    @GetMapping("/getall")
    public DataResult<List<City>> getAll() {
        return cityService.gelAll();
    }



}
