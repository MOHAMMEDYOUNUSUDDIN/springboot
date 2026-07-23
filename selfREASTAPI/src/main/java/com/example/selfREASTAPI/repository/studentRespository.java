package com.example.selfREASTAPI.repository;

import com.example.selfREASTAPI.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRespository extends JpaRepository<student,Long> {
}
