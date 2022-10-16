package com.student.data.service.impl;

import com.student.data.entity.Student;
import com.student.data.repository.studentRepository;
import com.student.data.service.iStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class studentServiceImpl implements iStudentService {

    private studentRepository studentRepo;

    public studentServiceImpl(studentRepository studentRepo) {
        super();
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> findAllStudents() {

        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }
}
