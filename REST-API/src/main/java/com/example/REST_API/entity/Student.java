package com.example.REST_API.entity;

import jakarta.persistence.*;

@Entity

public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String email;
}
