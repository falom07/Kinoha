package org.study.springStudent.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.tool.schema.internal.exec.GenerationTarget;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.Objects;
@Entity
@Data
@Table(name = "st_class")
public class Student {
    public Student(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public Student(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private LocalDate date_of_birthday;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;
}
