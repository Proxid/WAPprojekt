package com.uep.wap.controller;

import com.uep.wap.exception.NotFoundException;
import com.uep.wap.model.Post;
import com.uep.wap.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") int id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Post not found"));
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable("id") int id, @RequestBody Post updatedPost) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Post not found"));

        post.setUserID(updatedPost.getUserID());
        post.setListOfTags(updatedPost.getListOfTags());
        post.setListOfLiked(updatedPost.getListOfLiked());
        post.setNumberLikes(updatedPost.getNumberLikes());
        post.setPostDate(updatedPost.getPostDate());
        post.setPostDescr(updatedPost.getPostDescr());
        post.setPostTags(updatedPost.getPostTags());
        post.setPhotoID(updatedPost.getPhotoID());

        return postRepository.save(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable("id") int id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Post not found"));

        postRepository.delete(post);
    }
}
