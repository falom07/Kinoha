package org.study.springStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.springStudent.model.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student> findStudentByEmail(String email);
    void deleteByEmail(String email);
}
