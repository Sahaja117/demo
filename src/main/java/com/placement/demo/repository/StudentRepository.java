
package com.placement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.placement.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}