package com.uep.wap.controller;

import java.util.List;

import com.uep.wap.dto.TagDTO;
import com.uep.wap.model.Tag;
import com.uep.wap.service.TagsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class TagsController {

    private final TagsService tagsService;

    public TagsController(TagsService tagsService) {
        this.tagsService = tagsService;
    }

    @GetMapping(path = "/tags")
    public Iterable<Tag> getAllTags() {
        return tagsService.getAllTags();
    }

    @PostMapping(path = "/tag")
    public String addTag(@RequestBody TagDTO tag) {
        try {
            tagsService.addTag(tag);
            return "Tag added successfully!";
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return "Single tag not added";
        }
    }

    // @PostMapping("/{photoId}/tags")
    // public Photo assignTagToPhoto(@PathVariable Long photoId, @RequestBody Tag tag){
    //     Photo photo = photoRepository.findById(photoId).orElse(null);
    //     Tag existingTag = tagRepository.findByName(tag.getName());

    //     if(existingTag == null){
    //         existingTag = tagRepository.save(tag);
    //     }

    //     if(photo != null){
    //         photo.getTags().add(existingTag);
    //     }

    //     return photoRepository.save(photo);
    // }

    @PostMapping(path = "/tags")
    public String addTags(@RequestBody List<TagDTO> tags) {
        try {
            tagsService.addTags(tags);
            return "Multiple tags added successfully!";
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return "Multiple tags not added";
        }
    }

    // @PutMapping(path = "/tag/{tagID}")
    // public String updatePhoto(@PathVariable int photoID, @RequestBody PhotoDTO updatedPhoto) {
    //     System.out.println("id" + photoID);
    //     try {
    //         photosService.updatePhoto(photoID, updatedPhoto.getPhotoUrl(), updatedPhoto.getPhotoTags());
    //         return "Photo updated successfully!";
    //     } catch (Exception e) {
    //         System.err.println("Error: " + e.getMessage());
    //         return "Photo not updated";
    //     }
    // }

    @DeleteMapping("/tag/{id}")
    public String deleteTag(@PathVariable int id) {
        try {
            tagsService.deleteTag(id);
            return "Tag deleted successfully!";
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return "Tago not deleted";
        }
    }

    @DeleteMapping("/tags")
    public String deleteAllTags() {
        try {
            tagsService.deleteAllTags();
            return "All tags deleted successfully";
        } catch (Exception e) {
            return "Tags not found";
        }
    }

}
