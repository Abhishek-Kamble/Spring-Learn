package com.abhishekkamblein.springboot.learnjpaandhibernate.course.jpa;

import com.abhishekkamblein.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

  @Autowired
  private CourseJpaRepository repository;

  @Override
  public void run(String... args) throws Exception {
    repository.insert(new Course(1, "Spring Tutorial new version", "Abhishek Kamble"));
    repository.insert(new Course(2, "Spring Boot Tutorial new version", "Abhishek Kamble"));
    repository.insert(new Course(3, "Microservices Tutorial new version", "Abhishek Kamble"));
    repository.deleteById(2);
    System.out.println(repository.findById(1));
    System.out.println(repository.findById(3));
  }
}
