package com.onlinefooddelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinefooddelivery.model.ALogin;
import com.onlinefooddelivery.service.ALoginService;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class ALoginController {
	@Autowired
	ALoginService ALoginService;
	//http://localhost:8080/api/v1/admin
	@PostMapping("/admin")
	public boolean validateALogin(@RequestBody ALogin alogin) 		
	{
		System.out.println("in controller ="+alogin.getEmail_id());
		ALogin a = ALoginService.validateALogin(alogin);
		if (a==null)
		
		return false;
			
		else
			return true;
//		return a;
		
	}
}