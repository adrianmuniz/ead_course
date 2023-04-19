package com.ead.course.services;

import com.ead.course.models.CourseModel;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

public interface CourseService {

    void delete(CourseModel courseModel);

    CourseModel save(CourseModel courseModel);

    Optional<CourseModel> findById(UUID courseId);

    List<CourseModel> findAll();
}
