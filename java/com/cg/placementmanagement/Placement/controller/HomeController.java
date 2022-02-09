package com.cg.placementmanagement.Placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.cg.placementmanagement.Placement.service.AdminService;

@RestController
public class HomeController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/homepage")
	public ModelAndView homePage() {
		
		return new ModelAndView("homepage");
	}

}