package project.hrms.business.abstracts.storage;

import org.springframework.web.multipart.MultipartFile;
import project.hrms.entities.concretes.cvInformations.enums.StorageType;

import java.io.IOException;

public interface FileService {
    String uploadFile(MultipartFile file) throws IOException;
    StorageType getFileStorageName();
}
