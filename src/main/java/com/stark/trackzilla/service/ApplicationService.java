package com.stark.trackzilla.service;

import com.stark.trackzilla.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}
