package com.codewithcollins.electro_desk_app.controller;

import com.codewithcollins.electro_desk_app.model.dto.RegisterDTO;
import com.codewithcollins.electro_desk_app.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService service;

    ///  get all the students
    @GetMapping("/all")
        public ResponseEntity<?> allStudents(){

        return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
    }

    // Add a student
    @PostMapping("/add")
public ResponseEntity<?> addStudent (@Valid @RequestBody RegisterDTO std){
        service.addStudent(std);
        return new ResponseEntity<>("Everyting was okay",HttpStatus.OK);
    }
}
