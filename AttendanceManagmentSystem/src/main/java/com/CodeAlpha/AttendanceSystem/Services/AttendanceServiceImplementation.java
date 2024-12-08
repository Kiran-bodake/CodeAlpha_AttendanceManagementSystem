package com.CodeAlpha.AttendanceSystem.Services;

import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import com.CodeAlpha.AttendanceSystem.repositorys.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImplementation implements AttendanceService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void markAttendance(Long studentId, String status) {
        Student student = studentRepository.findById(studentId).orElse(null);
        if (student != null) {
            student.setAttendanceStatus(status);
            studentRepository.save(student);
        }
    }
}
