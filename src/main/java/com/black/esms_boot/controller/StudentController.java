package com.black.esms_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.black.esms_boot.model.Student;
import com.black.esms_boot.repository.StudentRepository;

@Controller
@RequestMapping(path = "/student")
public class StudentController {
    

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addStudent(@RequestParam String name, @RequestParam String email) {
        Student s = new Student();
        s.setName(name);
        s.setEmail(email);
        studentRepository.save(s);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Student> getAllUsers(){
        return studentRepository.findAll();
    }
    


}