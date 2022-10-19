package com.student.data.controller;


import com.student.data.entity.Student;
import com.student.data.service.impl.studentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


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

    @GetMapping("/students/new")
    public String createStudentForm(Model model){

        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students/create")
    public String createStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_Student";
    }

    @PostMapping("students/update/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student){
        studentService.updateStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/delete/{id}")
    public String remove(@PathVariable Long id, Model model){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

}
