package com.example.REST_API.service;

import com.example.REST_API.dto.StudentDto;
import com.example.REST_API.entity.Student;
import com.example.REST_API.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public StudentDto getStudent(Integer id) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            return new StudentDto(student.getId(), student.getName(), student.getEmail());
        }
        return null;
    }
    
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail()))
                .collect(Collectors.toList());
    }
    
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        
        Student savedStudent = studentRepository.save(student);
        return new StudentDto(savedStudent.getId(), savedStudent.getName(), savedStudent.getEmail());
    }
}
