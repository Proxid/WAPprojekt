package com.uep.wap.controller;
import com.uep.wap.exception.NotFoundException;
import com.uep.wap.model.UserGallery;
import com.uep.wap.repository.UserGalleryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-galleries")
public class UserGalleryController {

    private final UserGalleryRepository userGalleryRepository;

    public UserGalleryController(UserGalleryRepository userGalleryRepository) {
        this.userGalleryRepository = userGalleryRepository;
    }

    @GetMapping
    public List<UserGallery> getAllUserGalleries() {
        return userGalleryRepository.findAll();
    }

    @GetMapping("/{id}")
    public UserGallery getUserGalleryById(@PathVariable("id") int id) {
        return userGalleryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User gallery not found"));
    }

    @PostMapping
    public UserGallery createUserGallery(@RequestBody UserGallery userGallery) {
        return userGalleryRepository.save(userGallery);
    }

    @PutMapping("/{id}")
    public UserGallery updateUserGallery(@PathVariable("id") int id, @RequestBody UserGallery updatedUserGallery) {
        UserGallery userGallery = userGalleryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User gallery not found"));

        userGallery.setUserID(updatedUserGallery.getUserID());
        userGallery.setPostID(updatedUserGallery.getPostID());
        userGallery.setPhotoDesc(updatedUserGallery.getPhotoDesc());
        userGallery.setPostingData(updatedUserGallery.getPostingData());

        return userGalleryRepository.save(userGallery);
    }

    @DeleteMapping("/{id}")
    public void deleteUserGallery(@PathVariable("id") int id) {
        UserGallery userGallery = userGalleryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User gallery not found"));

        userGalleryRepository.delete(userGallery);
    }
}
