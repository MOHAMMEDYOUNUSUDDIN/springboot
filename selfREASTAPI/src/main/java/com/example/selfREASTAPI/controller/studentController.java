package com.example.selfREASTAPI.controller;

import com.example.selfREASTAPI.DTO.studentDTO;

import com.example.selfREASTAPI.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class studentController {

    private final studentService studentService;

    @GetMapping("/students")
    public List<studentDTO> getAllStudent(){

        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public String getStudentTD(@PathVariable Long id){
        return studentService.getStudentTD(id);
    }


}
