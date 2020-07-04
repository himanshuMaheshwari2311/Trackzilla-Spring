package com.stark.trackzilla;

import com.stark.trackzilla.entity.Application;
import com.stark.trackzilla.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrackzillaApplication {

    public static void main(String[] args) {
		SpringApplication.run(TrackzillaApplication.class, args);
	}

}
