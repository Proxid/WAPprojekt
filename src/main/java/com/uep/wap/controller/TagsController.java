package com.uep.wap.controller;

import java.util.List;

import com.uep.wap.dto.PhotoDTO;
import com.uep.wap.model.Photo;
import com.uep.wap.service.PhotosService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class TagsController {

    private final TagsService tagsService;

    public TagsController(TagsService tagsService) {
        this.tagsService = tagsService;
    }

    @GetMapping(path = "/tags")
    public Iterable<Photo> getAllTags() {
        return tagsService.getAllTags();
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

    @PostMapping("/{photoId}/tags")
    public Photo assignTagToPhoto(@PathVariable Long photoId, @RequestBody Tag tag){
        Photo photo = photoRepository.findById(photoId).orElse(null);
        Tag existingTag = tagRepository.findByName(tag.getName());

        if(existingTag == null){
            existingTag = tagRepository.save(tag);
        }

        if(photo != null){
            photo.getTags().add(existingTag);
        }

        return photoRepository.save(photo);
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
