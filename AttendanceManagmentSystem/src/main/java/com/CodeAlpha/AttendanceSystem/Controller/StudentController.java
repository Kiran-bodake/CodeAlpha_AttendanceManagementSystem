package com.CodeAlpha.AttendanceSystem.Controller;

import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import com.CodeAlpha.AttendanceSystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/add")
    public String showStudentForm(Model model) {
        model.addAttribute("branches", studentService.getAllBranches());
        return "studentform";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/student/list";
    }

    @GetMapping("/list")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "listofstudents";
    }
}
