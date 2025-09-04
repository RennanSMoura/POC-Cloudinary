package Penelope.PocCloudinary.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class cloudnaryService {

    private final Cloudinary cloudinary;

    public cloudnaryService(){
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "NOME_CLOUD",
                "api_key", "API_KEY_VALUE",
                "api_secret", "API_SECRET_VALUE"
        ));
    }

    public String uploadImage(byte[] fileBytes) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(fileBytes, ObjectUtils.emptyMap());
        return uploadResult.get("secure_url").toString();
    }
}
