package project.hrms.business.concretes.storage;

import org.springframework.web.multipart.MultipartFile;
import project.hrms.business.abstracts.storage.FileService;
import project.hrms.entities.concretes.cvInformations.enums.StorageType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

	public class LocalFileManager implements FileService {

	@Override
	public String uploadFile(MultipartFile file) throws IOException {
		File convFile = new File("src/main/resources/temporaryFolder/"+file.getOriginalFilename());
		String path = convFile.getAbsolutePath();
		file.transferTo(Path.of(convFile.getAbsolutePath()));
		
		return path;
	}

	@Override
	public StorageType getFileStorageName() {
		return StorageType.Local;
	}

}
