package org.study.springStudent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.metadata.HsqlTableMetaDataProvider;
import org.springframework.stereotype.Service;
import org.study.springStudent.model.Student;
import org.study.springStudent.repository.StudentRepository;
import org.study.springStudent.service.interfaces.IStudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
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
        //        student.map(Student::getAge)
//                .orElse(12);
        // if we have one field that we should change to some default
        return studentRepository.findStudentByEmail(email).orElse(new Student("none", "nones"));
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail(email);

    }
}
