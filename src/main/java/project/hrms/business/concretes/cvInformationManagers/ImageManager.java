package project.hrms.business.concretes.cvInformationManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.cvInformationServices.ImageService;
import project.hrms.core.adapters.Cloudinary.FileService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CandidateDao;
import project.hrms.dataAccess.abstracts.cvInformationDaos.ImageDao;
import project.hrms.entities.concretes.cvInformations.Image;
import project.hrms.entities.concretes.cvInformations.enums.StorageType;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@SpringBootApplication
@Component
public class ImageManager implements ImageService {

    private ImageDao imageDao;
    private FileService fileService;
    private CandidateDao candidateDao;

    @Autowired
    public ImageManager(ImageDao imageDao, FileService fileService, CandidateDao candidateDao) {
        this.imageDao = imageDao;
        this.fileService = fileService;
        this.candidateDao = candidateDao;
    }


    @Override
    public Result add(int resumeId, String path) throws IOException {
        File file= (new File(path));// dosya yolu verilen foto cloudinary'e yüklenecek upload metodu ile
        String link=fileService.upload(file);// link: cloudinary yüklenen fotonun linki
        Image image = new Image(
                resumeId,
        candidateDao.findById(resumeId).get().getFirstName()+candidateDao.findById(resumeId).get().getLastName(),
        link,
        StorageType.Cloudinary,
        candidateDao.findById(resumeId).get());
        imageDao.save(image);
        candidateDao.save(candidateDao.findById(resumeId).get());
        return new SuccessResult("Foto yüklendi.Link: "+ link);
    }

    @Override
    public DataResult<Image> getById(int id) {
        return new SuccessDataResult<Image>(this.imageDao.findById(id).get(),"resim:");
    }

    @Override
    public DataResult<List<Image>> getAll() {
        return new SuccessDataResult<List<Image>>(this.imageDao.findAll(),"listelendi");
    }

    @Override
    public DataResult<List<Image>> getByCandidateId(int id) {
        return new SuccessDataResult<List<Image>>(this.imageDao.getByCandidate_Id(id));
    }
}
