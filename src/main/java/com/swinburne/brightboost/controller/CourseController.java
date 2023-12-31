package com.swinburne.brightboost.controller;

import com.swinburne.brightboost.domain.Course;
import com.swinburne.brightboost.domain.Event;
import com.swinburne.brightboost.domain.Teacher;
import com.swinburne.brightboost.domain.User;
import com.swinburne.brightboost.service.CourseService;
import com.swinburne.brightboost.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    public CourseController() {
    }

    @GetMapping("/course/create")
    public String courseCreate(Model model) {
        model.addAttribute("course", new Course());
        return "courseCreate";
    }

    @PostMapping("/course/save")
    public String courseSave(HttpServletRequest request, @ModelAttribute Course course, Model model) {
        this.courseService.courseSave(course);
        model.addAttribute("courses",this.courseService.courses());
        return "courseList";
    }


}
