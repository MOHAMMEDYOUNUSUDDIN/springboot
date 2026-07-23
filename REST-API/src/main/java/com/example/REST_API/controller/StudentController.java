package com.example.REST_API.controller;

import com.example.REST_API.dto.StudentDto;
import com.example.REST_API.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }
    
    @GetMapping("/{id}")
    public StudentDto getStudentbyID(@PathVariable Integer id) {
        return studentService.getStudent(id);
    }
    
    @PostMapping
    public StudentDto createStudent(@RequestBody StudentDto studentDto) {
        return studentService.createStudent(studentDto);
    }
}
