package com.one.college.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.one.college.entity.Admission;
import com.one.college.repo.AdmissionRepo;



@Controller
@SessionAttributes("admission")
public class AdmissionController {
	@Autowired
	private AdmissionRepo repo;
	@ModelAttribute("admission")
	public Admission admission() {
		return new Admission();
	}
	@GetMapping("/one")
	public String one() {
		return "form/one";
	}
	@PostMapping("one")
	public String post(@ModelAttribute("admission")Admission a) {
		return "redirect:/two";
	}
	@GetMapping("/two")
	public String two() {
		return "form/two";
	}
	@PostMapping("two")
	public String con(@ModelAttribute("admission")Admission a) {
		return "redirect:/confirm";
	}
	@GetMapping("/confirm")
	public String con() {
		return "form/confirm";
	}
	
	@PostMapping("/submit")
    public String submit(@ModelAttribute("admission") Admission a, SessionStatus s) {
        repo.save(a); s.setComplete();
        return "redirect:/complete";
    }

    @GetMapping("/complete") public String complete() { return "form/complete"; }

}
