package com.project.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.dashboard.model.Project;

@Controller
public class AddController {

	@RequestMapping (value = "/project")
	public String displayHomePage(Model aModel) {
		return "project";
	}
	
	
	@RequestMapping (value = "/addProject")
	public String displayAddPage(Model aModel) {
		aModel.addAttribute("projectModel", new Project());
		return "add_project";
	}

}
