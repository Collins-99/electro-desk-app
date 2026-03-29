package com.codewithcollins.electro_desk_app.model.Mapper;


import com.codewithcollins.electro_desk_app.model.Entity.Student;
import com.codewithcollins.electro_desk_app.model.dto.RegisterDTO;
import com.codewithcollins.electro_desk_app.model.dto.StudentDto;

public class StudentMapper {

    public static StudentDto studentToDto(Student student)  {
        StudentDto dto = new StudentDto();
        dto.setStudentIndex(student.getStudentIndex());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setOtherNames(student.getOtherNames());
        dto.setEmail(student.getEmail());
        dto.setDOB(student.getDOB());
        dto.setLevel(student.getLevel());
        dto.setProgram(student.getProgram());
        dto.setAdmissionLetterUrl(student.getAdmissionLetterUrl());
        dto.setPassword(student.getPassword());
        dto.setPhone(student.getPhone());
        dto.setGuardianName(student.getGuardianName());
        dto.setGuardianPhone(student.getGuardianPhone());
        dto.setHomeTown(student.getStudyMode());
        dto.setStudyMode(student.getStudyMode());

    ///  Add the password encoder here and set the password
        return dto;
    }

    public static Student DtoTostudent(StudentDto dto)  {
        Student student = new Student();
        student.setStudentIndex(dto.getStudentIndex());
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setOtherNames(dto.getOtherNames());
        student.setEmail(dto.getEmail());
        student.setDOB(dto.getDOB());
        student.setLevel(dto.getLevel());
        student.setProgram(dto.getProgram());
        student.setAdmissionLetterUrl(dto.getAdmissionLetterUrl());
        student.setPassword(dto.getPassword());
        student.setPhone(dto.getPhone());
        student.setGuardianName(dto.getGuardianName());
        student.setGuardianPhone(dto.getGuardianPhone());
        student.setHomeTown(dto.getHomeTown());
        student.setStudyMode(dto.getStudyMode());
        ///  Add the password encoder here and set the password
        return student;
    }


    public static Student RegisterDtoToStudent(RegisterDTO dto){
        Student student = new Student();
        student.setStudentIndex(dto.getStudentIndex());
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setOtherNames(dto.getOtherNames());
        student.setEmail(dto.getEmail());
        student.setDOB(dto.getDOB());
        student.setLevel(dto.getLevel());
        student.setProgram(dto.getProgram());
        student.setPassword(dto.getPassword());
        student.setPhone(dto.getPhone());
        student.setGuardianName(dto.getGuardianName());
        student.setGuardianPhone(dto.getGuardianPhone());
        student.setHomeTown(dto.getHomeTown());
        student.setStudyMode(dto.getStudyMode());
        return student;
    }
}
