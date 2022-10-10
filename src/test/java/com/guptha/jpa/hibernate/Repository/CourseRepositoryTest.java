package com.guptha.jpa.hibernate.Repository;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.guptha.jpa.hibernate.JpaHiberanteDemoApplication;
import com.guptha.jpa.hibernate.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaHiberanteDemoApplication.class)
class CourseRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository respository;

	@Test
	public void findById() {
		Course course = respository.findById(10001L);
		assertEquals("jpa", course.getName());
	}

}
