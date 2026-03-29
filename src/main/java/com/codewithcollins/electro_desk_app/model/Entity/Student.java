package com.codewithcollins.electro_desk_app.model.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;


///  this is for the student entity
@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "index",unique = true)
    private String studentIndex;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "othernames")
    private String otherNames;

    private String program;

    private String level;

    private String DOB;

    @Column(unique = true)
    private String email;

    private String password;

    private String phone;

    @Column(name = "admissionletterurl",unique = true)
    private String admissionLetterUrl;

    private boolean status;

    private final Date createdAt = new Date(System.currentTimeMillis());

    @NotBlank(message = "Guardian Phone is required")
    @Size(min = 10,max = 14,message = "guardian Phone should be between 10 to 14 Characters")
    private String guardianPhone;

    @Column(name = "guardian_name")
    private String guardianName;


    @Column(name = "home_town")
    private String homeTown;

    @Column(name = "study_mode")
    private String studyMode;


    public Student(){
    }

    public Student(String studentIndex, String firstName, String lastName, String otherNames, String program, String level, String DOB, String email, String password, String phone, String admissionLetterUrl, boolean status, String guardianPhone, String guardianName, String homeTown, String studyMode) {
        this.studentIndex = studentIndex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherNames = otherNames;
        this.program = program;
        this.level = level;
        this.DOB = DOB;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.admissionLetterUrl = admissionLetterUrl;
        this.status = status;
        this.guardianPhone = guardianPhone;
        this.guardianName = guardianName;
        this.homeTown = homeTown;
        this.studyMode = studyMode;
    }

    public String getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(String student_index) {
        this.studentIndex = student_index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmissionLetterUrl() {
        return admissionLetterUrl;
    }

    public void setAdmissionLetterUrl(String admissionLetterUrl) {
        this.admissionLetterUrl = admissionLetterUrl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(String guardianPhone) {
        this.guardianPhone = guardianPhone;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getStudyMode() {
        return studyMode;
    }

    public void setStudyMode(String studyMode) {
        this.studyMode = studyMode;
    }
}

