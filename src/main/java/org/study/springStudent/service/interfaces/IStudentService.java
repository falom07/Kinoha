package org.study.springStudent.service.interfaces;

import org.study.springStudent.model.Student;

import java.util.List;

public interface IStudentService {
     List<Student> findAllStudent();
     Student saveStudent(Student student);
     Student updateStudent(Student student);
     Student findStudentByEmails(String email);
     void deleteStudent(String email);
}
