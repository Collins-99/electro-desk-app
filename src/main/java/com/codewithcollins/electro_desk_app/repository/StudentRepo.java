package com.codewithcollins.electro_desk_app.repository;

import com.codewithcollins.electro_desk_app.model.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

}
