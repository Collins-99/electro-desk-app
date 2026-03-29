package com.codewithcollins.electro_desk_app.service;

import com.codewithcollins.electro_desk_app.model.Entity.Student;
import com.codewithcollins.electro_desk_app.model.Mapper.StudentMapper;
import com.codewithcollins.electro_desk_app.model.dto.RegisterDTO;
import com.codewithcollins.electro_desk_app.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;

    ///  get All students
    public List<?> getAllStudents(){
//        List list = new ArrayList<>();
//        list.add("collins");
//        list.add("levels");
//        list.add("cindy");
        System.out.println("get all students called");
        return repo.findAll();
    }

    ///  add a student
    public void addStudent(RegisterDTO registerDTO){
        //
        Student student = new Student();
        student = StudentMapper.RegisterDtoToStudent(registerDTO);
        repo.save(student);
    }
}
