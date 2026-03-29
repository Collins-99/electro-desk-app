package com.codewithcollins.electro_desk_app.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentDto {

    @NotBlank(message = "Index is required")
    private String studentIndex;

    @NotBlank(message = "FirstName is required")
    @Size(min = 3, max = 25, message = "First Name must be between 3 and 25 characters")
    private String firstName;


    @NotBlank(message = "Last Name is required")
    @Size(min = 3, max = 25, message = "Last Name must be between 3 and 25 characters")
    private String lastName;


    @Size( max = 25, message = "Other Names must be between 0 and 50 characters")
    private String otherNames;

    @NotBlank(message = "Program is required")
    private String program;

    @NotBlank(message = "Level is required")
    private String level;

    @NotBlank(message = "Date Of Birth is required")
    private String DOB;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6,max = 20,message = "Password should be between 6 to 20 Characters")
    private String password;

    @NotBlank(message = "Phone is required")
    @Size(min = 10,max = 14,message = "phone should be between 10 to 14 Characters")
    private String phone;

    @NotBlank(message = "pin is required")
    @Size(min = 6,max = 20,message = "pin should be between 10 to 20 Characters")
    private String pin;

    @NotBlank(message = "Guardian Phone is required")
    @Size(min = 10,max = 14,message = "guardian Phone should be between 10 to 14 Characters")
    private String guardianPhone;

    @NotBlank(message = "Guardian name is required")
    @Size(min = 7, max = 50, message = "Guardian Name must be between 7 and 50 characters")
    private String guardianName;


    @NotBlank(message = "Home Town name is required")
    @Size(min = 3, max = 70, message = "Home Town must be between 3 and 25 characters")
    private String homeTown;


    @NotBlank(message = "Study Mode name is required")
    @Size(min = 3, max = 70, message = "Study Mode must be between 3 and 25 characters")
    private String studyMode;

    //    @NotBlank(message = "Addmission Letter is required")
    private String admissionLetterUrl;

    public StudentDto(){}


    public StudentDto(String studentIndex,String pin, String firstName, String lastName, String otherNames, String program, String level, String DOB, String email, String password, String phone, String guardianPhone, String guardianName, String homeTown, String studyMode, String admissionLetterUrl) {
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
        this.guardianPhone = guardianPhone;
        this.guardianName = guardianName;
        this.homeTown = homeTown;
        this.studyMode = studyMode;
        this.admissionLetterUrl = admissionLetterUrl;
        this.pin = pin;
    }

    public String getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(String studentIndex) {
        this.studentIndex = studentIndex;
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

    public void setAdmissionLetterUrl(String admissionLetterUrl) {
        this.admissionLetterUrl = admissionLetterUrl;
    }

    public void setPin(String pin){this.pin = pin;}

    public String getPin(){return pin;}
}
