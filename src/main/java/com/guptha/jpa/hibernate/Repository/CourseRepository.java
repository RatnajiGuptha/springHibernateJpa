package com.guptha.jpa.hibernate.Repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guptha.jpa.hibernate.entity.Course;

@Repository
public class CourseRepository {

	@Autowired
	EntityManager em;

	public Course findById(Long id) {
		return  em.find(Course.class, id);
	}
//	public COurse save(Course course) -> insert or update
//	public void deleteById(Long Id)

}
