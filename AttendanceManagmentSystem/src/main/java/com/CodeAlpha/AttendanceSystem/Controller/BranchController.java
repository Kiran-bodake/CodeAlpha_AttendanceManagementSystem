package com.CodeAlpha.AttendanceSystem.Controller;

import com.CodeAlpha.AttendanceSystem.Entitys.Branches;
import com.CodeAlpha.AttendanceSystem.Services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/add")
    public String showBranchForm() {
        return "branchform";
    }

    @PostMapping("/add")
    public String addBranch(@RequestParam String branchName) {
        Branches branch = new Branches();
        branch.setName(branchName);  // Set branch name
        branchService.saveBranch(branch);  // Save branch
        return "redirect:/branch/list";  // Redirect to list after saving
    }

    @GetMapping("/list")
    public String listBranches(Model model) {
        model.addAttribute("brancheDetails", branchService.getAllBranches());
        return "listofbranches";
    }
    
    
    
}
