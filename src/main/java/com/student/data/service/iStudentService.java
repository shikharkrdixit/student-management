package com.student.data.service;

import com.student.data.entity.Student;

import java.util.List;

public interface iStudentService {

    public List<Student> findAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
