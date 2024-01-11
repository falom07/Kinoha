package org.study.springStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.springStudent.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findStudentByEmail(String email);
    void deleteByEmail(String email);
}
