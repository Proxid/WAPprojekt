package com.uep.wap.controller;
import com.uep.wap.exception.NotFoundException;
import com.uep.wap.model.Like;
import com.uep.wap.repository.LikesRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikeController {

    private final LikesRepository likeRepository;

    public LikeController(LikesRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @GetMapping
    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Like getLikeById(@PathVariable("id") int id) {
        return likeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Like not found"));
    }

    @PostMapping
    public Like createLike(@RequestBody Like like) {
        return likeRepository.save(like);
    }

    @PutMapping("/{id}")
    public Like updateLike(@PathVariable("id") int id, @RequestBody Like updatedLike) {
        Like like = likeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Like not found"));

        like.setUserID(updatedLike.getUserID());
        like.setPhotoID(updatedLike.getPhotoID());
        like.setUserIDLike(updatedLike.getUserIDLike());
        like.setUsernameLike(updatedLike.getUsernameLike());
        like.setTargetID(updatedLike.getTargetID());
        like.setTimeStamp(updatedLike.getTimeStamp());

        return likeRepository.save(like);
    }

    @DeleteMapping("/{id}")
    public void deleteLike(@PathVariable("id") int id) {
        Like like = likeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Like not found"));

        likeRepository.delete(like);
    }
}
