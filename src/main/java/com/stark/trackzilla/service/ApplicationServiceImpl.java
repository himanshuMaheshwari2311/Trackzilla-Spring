package com.stark.trackzilla.service;

import com.stark.trackzilla.entity.Application;
import com.stark.trackzilla.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public Iterable<Application> listApplications() {
        return applicationRepository.findAll();
    }
}
