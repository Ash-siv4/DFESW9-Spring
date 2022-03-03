package com.qa.students.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.students.domain.Students;
import com.qa.students.service.StudentsService;

@RestController
public class StudentsController {
	//crud

	private StudentsService service;

	public StudentsController(StudentsService service) {
		super();
		this.service = service;
	}
	
	//create - post request
	@PostMapping("/create")
	public Students createMap(@RequestBody Students info) {
		return this.service.create(info);
	}
	
	//readAll - get request - list
	//readById - get request - 1 record
	
	//update - put request - need id (path param or path variable) and a body
	
	//delete - delete request  - need id
	
	
}
