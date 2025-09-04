package Penelope.PocCloudinary.controller;

import Penelope.PocCloudinary.service.cloudnaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/upload")
@CrossOrigin(origins = "*")
public class cloudnaryController {

    @Autowired
    private cloudnaryService cloudinaryService;

    @PostMapping
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file){
        try {
            String url = cloudinaryService.uploadImage(file.getBytes());
            return ResponseEntity.ok(url);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao enviar imagem" + e.getMessage());
        }
    }
}
