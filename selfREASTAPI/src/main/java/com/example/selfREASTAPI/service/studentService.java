package com.example.selfREASTAPI.service;

import com.example.selfREASTAPI.DTO.studentDTO;
import java.util.List;

public interface studentService{
    List<studentDTO> getAllStudents();

    studentDTO getStudentTD(Long id);
}
