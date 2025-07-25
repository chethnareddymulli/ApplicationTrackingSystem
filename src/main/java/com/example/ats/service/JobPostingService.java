package com.example.ats.service;

import com.example.ats.entity.JobPosting;
import com.example.ats.respository.JobPostingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostingService {

    private final JobPostingRepository jobPostingRepository;

    public JobPostingService(JobPostingRepository jobPostingRepository) {
        this.jobPostingRepository = jobPostingRepository;
    }

    public JobPosting saveJobPosting(JobPosting jobPosting) {
        return jobPostingRepository.save(jobPosting);
    }

    public List<JobPosting> getAllJobs() {
        return jobPostingRepository.findAll();
    }

    public Optional<JobPosting> getJob(Long id) {
        return jobPostingRepository.findById(id);
    }

    public void deleteJob(Long id) {
        jobPostingRepository.deleteById(id);
    }
}
