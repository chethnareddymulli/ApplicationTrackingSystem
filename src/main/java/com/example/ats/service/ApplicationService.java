package com.example.ats.service;

import com.example.ats.entity.Application;
import com.example.ats.respository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Optional<Application> getApplication(Long id) {
        return applicationRepository.findById(id);
    }

    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
}
