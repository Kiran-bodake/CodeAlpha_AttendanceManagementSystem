package com.CodeAlpha.AttendanceSystem.repositorys;

import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByBranchId(Long branchId);
}
