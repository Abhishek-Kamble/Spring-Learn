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
    repository.save(new Course(1, "Spring Tutorial new version", "Abhishek Kamble"));
    repository.save(new Course(2, "Spring Boot Tutorial new version", "Abhishek Kamble"));
    repository.save(new Course(3, "Microservices Tutorial new version", "Abhishek Kamble"));
    repository.deleteById(2l);
    System.out.println(repository.findById(1l));
    System.out.println(repository.findById(3l));

    System.out.println(repository.findAll());
  }
}
