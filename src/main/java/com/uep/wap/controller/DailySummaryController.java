package com.uep.wap.controller;
import com.uep.wap.exception.NotFoundException;
import com.uep.wap.model.DailySummary;
import com.uep.wap.repository.DailySummariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/daily-summaries")
public class DailySummaryController {

    private final DailySummariesRepository dailySummaryRepository;

    @Autowired
    public DailySummaryController(DailySummariesRepository dailySummaryRepository) {
        this.dailySummaryRepository = dailySummaryRepository;
    }

    @GetMapping
    public List<DailySummary> getAllDailySummaries() {
        return dailySummaryRepository.findAll();
    }

    @GetMapping("/{id}")
    public DailySummary getDailySummaryById(@PathVariable("id") int id) {
        return dailySummaryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Daily summary not found"));
    }

    @PostMapping
    public DailySummary createDailySummary(@RequestBody DailySummary dailySummary) {
        return dailySummaryRepository.save(dailySummary);
    }

    @PutMapping("/{id}")
    public DailySummary updateDailySummary(@PathVariable("id") int id, @RequestBody DailySummary updatedDailySummary) {
        DailySummary dailySummary = dailySummaryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Daily summary not found"));

        dailySummary.setCountOfPosts(updatedDailySummary.getCountOfPosts());
        dailySummary.setCountOfComments(updatedDailySummary.getCountOfComments());
        dailySummary.setCountOfEnthusiasts(updatedDailySummary.getCountOfEnthusiasts());
        dailySummary.setCountOfLikes(updatedDailySummary.getCountOfLikes());

        return dailySummaryRepository.save(dailySummary);
    }

    @DeleteMapping("/{id}")
    public void deleteDailySummary(@PathVariable("id") int id) {
        DailySummary dailySummary = dailySummaryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Daily summary not found"));

        dailySummaryRepository.delete(dailySummary);
    }
}