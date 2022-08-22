package com.springdemo.helloworld.services;

import com.springdemo.helloworld.entities.Courses;

import java.util.List;

public interface CourseService {

    public List<Courses> getAllCourses();

    public Courses getCourse(long courseId);

    public Courses addCourse(Courses course);

    public Courses updateCourse(Courses course);

   public void deleteCourse(long parseLong);
}
