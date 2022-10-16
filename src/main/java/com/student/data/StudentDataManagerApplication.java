package com.student.data;

import com.student.data.entity.Student;
import com.student.data.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDataManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentDataManagerApplication.class, args);
	}

	@Autowired
	studentRepository repository;

	@Override
	public void run(String... args) throws Exception{
		/*Student stu1 = new Student("firstNAme", "lastname", "gmail.com");
		repository.save(stu1);

		Student stu2 = new Student("firstNAme1", "lastname1", "1gmail.com");
		repository.save(stu2);*/


	}

}
