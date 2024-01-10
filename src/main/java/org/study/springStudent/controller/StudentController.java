package org.study.springStudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.study.springStudent.model.Student;
import org.study.springStudent.service.StudentServiceBD;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentServiceBD studentService;

    @Autowired
    public StudentController(StudentServiceBD studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/findAllStudent")
    public List<Student> findAllStudents(){
        return studentService.findAllStudent();
    }
    @PostMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @GetMapping("/findByEmail/{emailS}")
    public Student findByEmailStudent(@PathVariable(value = "emailS") String email){
        return studentService.findStudentByEmails(email);
    }
    @PostMapping("saveStudent")
    public Student saveStudent(@RequestBody Student student){
        System.out.println(student);
        return studentService.saveStudent(student);
    }
    @DeleteMapping("/deleteStudent/{email}")
    public void deleteStudent(@PathVariable (value = "email") String email){
        studentService.deleteStudent(email);
    }




}
