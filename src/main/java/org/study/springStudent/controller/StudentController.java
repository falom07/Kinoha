package org.study.springStudent.controller;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.study.springStudent.model.Student;
import org.study.springStudent.service.StudentService;

import java.util.List;

@Controller
@RequestMapping(value = "/students")
public class StudentController {
    private static final Logger logger = LogManager.getLogger(StudentController.class);
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    @ResponseBody
    public List<Student> findAllStudents(){
        return studentService.findAllStudent();
    }
    @PostMapping("/update_student")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @GetMapping("/find_by_email/{email}")
    public Student findByEmailStudent(@PathVariable String email){
        return studentService.findStudentByEmails(email);
    }
    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        logger.info(student);
        return studentService.saveStudent(student);
    }
    @DeleteMapping("/delete_student/{email}")
    public void deleteStudent(@PathVariable (value = "email") String email){
        studentService.deleteStudent(email);
    }

    @GetMapping("/takeHTML")
    public String takeHtml(){
        logger.info("in method");
        return "html/index.html";
    }
}
