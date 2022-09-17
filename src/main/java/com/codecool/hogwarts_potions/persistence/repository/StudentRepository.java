package com.codecool.hogwarts_potions.persistence.repository;

import com.codecool.hogwarts_potions.persistence.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
