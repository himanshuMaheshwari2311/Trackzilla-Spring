package com.stark.trackzilla.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.stark.trackzilla.entity.Application;
import com.stark.trackzilla.exception.ApplicationNotFoundQLException;
import com.stark.trackzilla.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation {
}
//public class Mutation implements GraphQLMutationResolver {
//
//    private ApplicationRepository applicationRepository;
//
//    @Autowired
//    public Mutation(ApplicationRepository applicationRepository) {
//        this.applicationRepository = applicationRepository;
//    }
//
//    public Application newApplication(String name, String owner, String description) {
//        Application app = new Application(name, owner, description);
//        applicationRepository.save(app);
//        return app;
//    }
//
//    public boolean deleteApplication(Long id) {
//        applicationRepository.deleteById(id);
//        return true;
//    }
//
//    public Application updateApplicationOwner(String newOwner, Long id) {
//        Optional<Application> optionalApplication = applicationRepository.findById(id);
//
//        if(optionalApplication.isPresent()){
//            Application application = optionalApplication.get();
//            application.setOwner(newOwner);
//            applicationRepository.save(application);
//            return application;
//        }
//        else {
//            throw new ApplicationNotFoundQLException("Application not found", id);
//        }
//
//    }
//}
