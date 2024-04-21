package com.vg.crud;

import com.vg.crud.dao.StudentDAO;
import com.vg.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner cmdRunner(StudentDAO studentDAO) {
		return runner -> {
			System.out.println("Hello world! running after spring beans have been loaded");
//			studentDAO.save(new Student("Piyush", "Jain", "pj@iitroorkee.in"));
//			System.out.println(studentDAO.findById(1));
//			List<Student> students = studentDAO.findAll();
//			List<Student> students = studentDAO.findByLastName("Jain");
//            for (Student student : students) {
//                System.out.println(student);
//            }

//			Student s = studentDAO.findById(1);
//			s.setEmail("vikasgog10@gmail.com");
//			studentDAO.update(s);

			studentDAO.delete(1);
		};
	}

}
