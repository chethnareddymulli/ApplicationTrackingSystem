package com.example.ats.controller;

import com.example.ats.entity.JobPosting;
import com.example.ats.service.JobPostingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobPostingController {

    private final JobPostingService jobPostingService;

    public JobPostingController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @PostMapping
    public ResponseEntity<JobPosting> addJob(@RequestBody JobPosting job) {
        return ResponseEntity.ok(jobPostingService.saveJobPosting(job));
    }

    @GetMapping
    public ResponseEntity<List<JobPosting>> getJobs() {
        return ResponseEntity.ok(jobPostingService.getAllJobs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPosting> getJobById(@PathVariable Long id) {
        return jobPostingService.getJob(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJob(@PathVariable Long id) {
        jobPostingService.deleteJob(id);
        return ResponseEntity.noContent().build();
    }
}
