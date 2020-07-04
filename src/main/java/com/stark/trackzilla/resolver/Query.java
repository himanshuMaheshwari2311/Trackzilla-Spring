package com.stark.trackzilla.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.stark.trackzilla.entity.Application;
import com.stark.trackzilla.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query {

}
//public class Query implements GraphQLQueryResolver {
//
//    private ApplicationRepository applicationRepository;
//
//    @Autowired
//    public Query(ApplicationRepository applicationRepository) {
//        this.applicationRepository = applicationRepository;
//    }
//
//    public Iterable<Application> findAllApplications() {
//        return applicationRepository.findAll();
//    }
//
//    public long countApplications() {
//        return applicationRepository.count();
//    }
//}
