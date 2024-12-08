package com.CodeAlpha.AttendanceSystem.Services;

import com.CodeAlpha.AttendanceSystem.Entitys.Student;

import java.util.List;

public interface AttendanceService {
    List<Student> getAllStudents();
    void markAttendance(Long studentId, String status);
}
