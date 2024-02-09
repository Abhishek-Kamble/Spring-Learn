package com.abhishekkamblein.springboot.learnjpaandhibernate.course.springdatajpa;

import com.abhishekkamblein.springboot.learnjpaandhibernate.course.Course;
import com.abhishekkamblein.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

  @Autowired
  private CourseSpringDataJpaRepository repository;

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Course(1, "Spring Tutorial", "Abhishek Kamble"));
    repository.save(new Course(2, "Spring Boot Tutorial", "Abhishek Kamble"));
    repository.save(new Course(3, "Microservices Tutorial", "Abhishek Kamble"));
//    repository.deleteById(2l);
//    System.out.println(repository.findById(1l));
//    System.out.println(repository.findById(3l));
//
//    System.out.println(repository.findAll());
    System.out.println(repository.count());
//    System.out.println(repository.findByAuthor("Abhishek Kamble"));
    System.out.println(repository.findByName("Spring Boot Tutorial"));
  }
}
