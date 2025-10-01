package com.one.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.one.college.entity.Admission;
import com.one.college.repo.AdmissionRepo;
@Controller
@RequestMapping("/admin")
public class AdminController {
	  @Autowired private AdmissionRepo repo;

	    @GetMapping("/list")
	    public String list(Model m) {
	        m.addAttribute("ads", repo.findAll());
	        return "admin/list";
	    }

	    @GetMapping("/edit/{id}")
	    public String edit(@PathVariable Long id, Model m) {
	        m.addAttribute("ad", repo.findById(id).orElse(new Admission()));
	        return "admin/edit";
	    }

	    @PostMapping("/update")
	    public String update(@ModelAttribute Admission a) {
	        repo.save(a);
	        return "redirect:/admin/list";
	    }

	    @GetMapping("/delete/{id}")
	    public String delete(@PathVariable Long id) {
	    	repo.deleteById(id);
	    	return "redirect:/admin/list";
	    }


}
