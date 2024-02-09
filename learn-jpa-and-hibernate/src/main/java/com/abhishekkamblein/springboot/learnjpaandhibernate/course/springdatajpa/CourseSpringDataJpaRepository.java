package com.abhishekkamblein.springboot.learnjpaandhibernate.course.springdatajpa;

import com.abhishekkamblein.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
