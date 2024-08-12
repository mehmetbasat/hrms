package project.hrms.core.adapters.Cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Map;

@Service
@Component
@SpringBootApplication
public class CloudinaryManager implements FileService {

    Cloudinary cloudinary;

    public CloudinaryManager() {
        this.cloudinary = new com.cloudinary.Cloudinary(ObjectUtils.asMap(
                "cloud_name","dqjgwzd8u",
                "api_key","241448942737512",
                "api_secret","yLRpN9PKhJs00vocBhmkGzdfqSM"));
    }


    @Override
    public String upload(File file) {
        try {
            Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
            return  (uploadResult.get("url").toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
