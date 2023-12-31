package com.swinburne.brightboost.service;

import com.swinburne.brightboost.domain.StudentCourse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentCourseService {
	public List<StudentCourse> findAll();

	public List<StudentCourse> findStudentCourseByStudentId(Long studentId);

	public Integer save(StudentCourse tc);

	public Integer deleteStudentCourseByStudentIdAndCourseId(Integer studentId, Integer courseId);
}
