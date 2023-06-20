package com.uep.wap.controller;

import java.util.List;

import com.uep.wap.dto.PhotoDTO;
import com.uep.wap.model.Photo;
import com.uep.wap.service.PhotosService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class PhotoController {

    private final PhotosService photosService;

    public PhotoController(PhotosService photosService) {
        this.photosService = photosService;
    }

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping(path = "/photos")
    public Iterable<Photo> getAllPhotos() {
        return photosService.getAllPhotos();
    }

    @PostMapping(path = "/photo")
    public String addPhoto(@RequestBody PhotoDTO photo) {
        try {
            photosService.addPhoto(photo);
            return "Photo added successfully!";
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return "Single photo not added";
        }
    }

    @PostMapping(path = "/photos")
    public String addPhotos(@RequestBody List<PhotoDTO> photos) {
        try {
            photosService.addPhotos(photos);
            return "Multiple photos added successfully!";
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return "Multiple photos not added";
        }
    }

    @PutMapping(path = "/photo/{photoID}")
    public String updatePhoto(@PathVariable int photoID, @RequestBody PhotoDTO updatedPhoto) {
        System.out.println("id" + photoID);
        try {
            photosService.updatePhoto(photoID, updatedPhoto.getPhotoUrl(), updatedPhoto.getPhotoTags());
            return "Photo updated successfully!";
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return "Photo not updated";
        }
    }

    @DeleteMapping("/photo/{id}")
    public String deletePhoto(@PathVariable int id) {
        try {
            photosService.deletePhoto(id);
            return "Photo deleted successfully!";
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return "Photo not deleted";
        }
    }

    @DeleteMapping("/photos")
    public String deleteAllPhotos() {
        try {
            photosService.deleteAllPhotos();
            return "All photos deleted successfully";
        } catch (Exception e) {
            return "Photos not found";
        }
    }

}
