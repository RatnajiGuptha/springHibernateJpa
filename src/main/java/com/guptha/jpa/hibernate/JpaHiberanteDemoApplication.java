package com.guptha.jpa.hibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guptha.jpa.hibernate.Repository.CourseRepository;
import com.guptha.jpa.hibernate.entity.Course;

@SpringBootApplication
public class JpaHiberanteDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaHiberanteDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Course course = repository.findById(10001L);
		logger.info("Course 10001 -> {}", course);

//		repository.deleteById(10001L);

	}

}
