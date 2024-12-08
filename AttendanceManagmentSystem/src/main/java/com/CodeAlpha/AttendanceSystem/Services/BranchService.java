package com.CodeAlpha.AttendanceSystem.Services;

import com.CodeAlpha.AttendanceSystem.Entitys.Branches;
import java.util.List;

public interface BranchService {
    void saveBranch(Branches branch);
    List<Branches> getAllBranches();
}
