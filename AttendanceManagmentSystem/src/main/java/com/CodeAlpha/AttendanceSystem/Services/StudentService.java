package com.CodeAlpha.AttendanceSystem.Services;

import com.CodeAlpha.AttendanceSystem.Entitys.Branches;
import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    List<Student> getAllStudents();
    List<Student> getStudentsByBranch(Long branchId);
	List<Branches> getAllBranches();

	
}
