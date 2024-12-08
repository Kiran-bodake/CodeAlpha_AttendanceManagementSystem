package com.CodeAlpha.AttendanceSystem.Controller;

import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import com.CodeAlpha.AttendanceSystem.Services.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/mark")
    public String showAttendancePage(Model model) {
        List<Student> students = attendanceService.getAllStudents();
        model.addAttribute("students", students);
        return "markattendance";
    }

    @PostMapping("/mark")
    public String markAttendance(@RequestParam("studentId") Long studentId,
                                 @RequestParam("status") String status) {
        attendanceService.markAttendance(studentId, status);
        return "redirect:/student/list";
    }
}
