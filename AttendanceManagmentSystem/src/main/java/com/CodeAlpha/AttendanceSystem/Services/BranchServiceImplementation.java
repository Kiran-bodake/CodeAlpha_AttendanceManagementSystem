package com.CodeAlpha.AttendanceSystem.Services;

import com.CodeAlpha.AttendanceSystem.Entitys.Branches;
import com.CodeAlpha.AttendanceSystem.repositorys.BranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImplementation implements BranchService {

    @Autowired
    private BranchesRepository branchesRepository;

    @Override
    public void saveBranch(Branches branch) {
        branchesRepository.save(branch);
    }

    @Override
    public List<Branches> getAllBranches() {
        return branchesRepository.findAll();
    }
}
