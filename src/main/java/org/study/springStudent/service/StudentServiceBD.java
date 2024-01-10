package org.study.springStudent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.springStudent.model.Student;
import org.study.springStudent.repository.StudentRepository;
import org.study.springStudent.service.interfaces.InterfaceStudentService;

import java.util.List;

@Service
public class StudentServiceBD implements InterfaceStudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceBD(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudentByEmails(String email) {
        return studentRepository.findStudentByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail(email);

    }
}
