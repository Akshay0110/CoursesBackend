package com.springdemo.helloworld.dao;

import com.springdemo.helloworld.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Courses,Long> {

}
