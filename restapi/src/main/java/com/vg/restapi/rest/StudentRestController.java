package com.vg.restapi.rest;

import com.vg.restapi.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    private void loadStudents() {
        students = new ArrayList<>();
        students.add(new Student("Vikas", 74));
        students.add(new Student("Piyush", 71));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        if(id >= 0 && id < students.size()) return students.get(id);
        else throw new StudentNotFoundException("Student id not found - " + id);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException ex) {
        StudentErrorResponse errResp = new StudentErrorResponse(
                HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(errResp, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception ex) {
        StudentErrorResponse errResp = new StudentErrorResponse(
                HttpStatus.BAD_REQUEST.value(), ex.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(errResp, HttpStatus.BAD_REQUEST);
    }
}
