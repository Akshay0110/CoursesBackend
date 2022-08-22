package com.springdemo.helloworld.services;

import com.springdemo.helloworld.dao.CourseDao;
import com.springdemo.helloworld.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImp implements CourseService{

//    List<Courses> list ;
    @Autowired
    CourseDao courseDao;

       public CourseServiceImp() {
////           list = new ArrayList<>();
////            list.add(new Courses(123, "java", "object oriented"));
////            list.add(new Courses(125, "c", "procedure oriented"));
        }
        @Override
    public List<Courses> getAllCourses(){

       return courseDao.findAll();

    }

    @Override
    public Courses getCourse(long courseId) {
//        Courses c =null;
//        for(Courses course:list)
//        {
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
        return courseDao.getReferenceById(courseId);
    }

    @Override
    public Courses addCourse(Courses course) {
//            list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Courses updateCourse(Courses course) {
//            list.forEach(e->{
//                if(e.getId()==course.getId()){
//                    e.setTitle(course.getTitle());
//                    e.setDescription(course.getDescription());
//                }
//            });

        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
//        list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
          Courses entity = (Courses) courseDao.getReferenceById(courseId);
          courseDao.delete(entity);
    }


}
