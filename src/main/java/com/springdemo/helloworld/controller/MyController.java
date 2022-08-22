package com.springdemo.helloworld.controller;

import com.springdemo.helloworld.entities.Courses;
import com.springdemo.helloworld.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springdemo.helloworld.services.CourseService;
import java.util.List;

@RestController
public class MyController {

//    @GetMapping("/home")
//    public String home()
//    {
//        return "WellCome all";
//    }
   @Autowired
    private CourseService Serve;


    @GetMapping("/Courses")
    public List<Courses> getAllCourses(){
        return this.Serve.getAllCourses();
    }


    @GetMapping("/Courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId)
    {
        return this.Serve.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/Courses")
    public Courses addCourse(@RequestBody Courses course){
        return this.Serve.addCourse(course);
    }

    @PutMapping("/Courses")
    public Courses updateCourse(@RequestBody  Courses course)
    {
        return this.Serve.updateCourse(course);
    }

    @DeleteMapping("Courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{
            this.Serve.deleteCourse(Long.parseLong((courseId)));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
