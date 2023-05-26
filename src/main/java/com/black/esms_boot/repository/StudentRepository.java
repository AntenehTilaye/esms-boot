package com.black.esms_boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.black.esms_boot.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
    
}