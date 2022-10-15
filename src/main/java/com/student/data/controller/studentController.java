package com.student.data.controller;


import com.student.data.entity.Student;
import com.student.data.service.impl.studentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class studentController {

    private studentServiceImpl studentService;

    public studentController(studentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String findAll(Model model){
        model.addAttribute("students", studentService.findAllStudents());
        return "students";
    }
}
