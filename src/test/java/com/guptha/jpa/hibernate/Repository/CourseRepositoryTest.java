package com.guptha.jpa.hibernate.Repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.guptha.jpa.hibernate.JpaHiberanteDemoApplication;
import com.guptha.jpa.hibernate.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaHiberanteDemoApplication.class)
class CourseRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository repository;

	@Test
	public void findById_basic() {
		Course course = repository.findById(10001L);
		assertEquals("jpa", course.getName());
	}

	@Test
	@DirtiesContext
	public void deleteById_basic() {
		repository.deleteById(10002L);
		assertNull(repository.findById(10002L));
	}

	@Test
	@DirtiesContext
	public void save_basic() {
//		get the course
		Course course = repository.findById(10001L);
		assertEquals("jpa", course.getName());

//		update the course
		course.setName("jpa - updated");
		repository.save(course);

//		check the value
		Course course1 = repository.findById(10001L);
		assertEquals("jpa - updated", course1.getName());

	}

	@Test
	@DirtiesContext
	public void playWithEntityManager() {
		repository.playWithEntityManager();
	}

}
