package com.cv.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cv.dao.DaoCreationCV;

@Controller
public class ControleurCv {

	@Autowired
	private DaoCreationCV creationCV;
	
	@GetMapping("/index")
	public String index() {
		
		return "index";
		
	}
	
}
