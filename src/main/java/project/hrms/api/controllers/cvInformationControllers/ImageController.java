package project.hrms.api.controllers.cvInformationControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.cvInformationServices.ImageService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.Image;

import java.io.IOException;
import java.util.List;

@RestController()
@RequestMapping("/api/images")
public class ImageController {

    private ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

   @PostMapping("uplaodFile")
    public Result add(@RequestParam String path, @RequestParam int resumeId) throws IOException {
        return imageService.add(resumeId, path);
   }

    @GetMapping("/getall")
    public DataResult<List<Image>> getAll(){
        return this.imageService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public DataResult<Image> getById(@PathVariable int id){
        return this.imageService.getById(id);
    }

    @GetMapping("/getbyuserid/{id}")
    public DataResult<List<Image>> getByCandidateId(@PathVariable int id){
        return this.imageService.getByCandidateId(id);
    }


}
