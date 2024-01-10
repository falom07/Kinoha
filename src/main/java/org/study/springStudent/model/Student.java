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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "day_of_birthday")

    private LocalDate date_of_birthday;
    @Column(name = "email",unique = true)
    private String email;

    @Transient
    private int age;

}
