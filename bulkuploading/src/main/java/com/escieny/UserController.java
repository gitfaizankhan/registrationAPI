package com.escieny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	
	@PostMapping("/add")
	public UserEntiry addUser(UserEntiry userEntiry) {
		userRepo.save(userEntiry);
		return userEntiry;
		
	}

}
