package com.example.selfREASTAPI.service.imple;

import com.example.selfREASTAPI.entity.student;
import  com.example.selfREASTAPI.DTO.studentDTO;
import com.example.selfREASTAPI.repository.studentRespository;
import com.example.selfREASTAPI.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class studentServiceimpl implements studentService {

    private final studentRespository studentRespository;


 public List<studentDTO> getAllStudents(){

        List<student>  students = studentRespository.findAll();
        List<studentDTO> studentDTOS = students.stream().map(student -> new studentDTO(student.getId(),student.getName(),student.getEmail())).toList();
     return List.of();
 }

    @Override
    public studentDTO getStudentTD(Long id) {
      student student= studentRespository.findById(id).orElseThrow(()-> new IllegalArgumentException("Student not found with"+id));

 }
}
