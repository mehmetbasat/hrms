package project.hrms.business.abstracts.cvInformationServices;

import org.springframework.http.ResponseEntity;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.cvInformations.Image;
import project.hrms.entities.dtos.ImageDto;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ImageService {
    Result add(int resumeId, String path) throws IOException;
    DataResult<Image> getById(int id);
    DataResult<List<Image>> getAll();
    DataResult<List<Image>> getByCandidateId(int id);
}
