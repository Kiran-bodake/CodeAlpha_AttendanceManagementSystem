package com.CodeAlpha.AttendanceSystem.Services;

import com.CodeAlpha.AttendanceSystem.Entitys.Branches;
import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import com.CodeAlpha.AttendanceSystem.repositorys.BranchesRepository;
import com.CodeAlpha.AttendanceSystem.repositorys.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentsByBranch(Long branchId) {
        return studentRepository.findByBranchId(branchId);
    }

	@Override
	public List<Branches> getAllBranches() {
		// TODO Auto-generated method stub
		return null;
	}
     
}
