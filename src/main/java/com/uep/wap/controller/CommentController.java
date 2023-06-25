package com.uep.wap.controller;

import com.uep.wap.exception.NotFoundException;
import com.uep.wap.model.Comment;
import com.uep.wap.repository.CommentsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentsRepository commentsRepository;

    public CommentController(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable("id") int id) {
        return commentsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Comment not found"));
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentsRepository.save(comment);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable("id") int id, @RequestBody Comment updatedComment) {
        Comment comment = commentsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Comment not found"));

        comment.setUserID(updatedComment.getUserID());
        comment.setPhotoID(updatedComment.getPhotoID());
        comment.setContent(updatedComment.getContent());
        comment.setTimeStamp(updatedComment.getTimeStamp());

        return commentsRepository.save(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable("id") int id) {
        Comment comment = commentsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Comment not found"));

        commentsRepository.delete(comment);
    }
}