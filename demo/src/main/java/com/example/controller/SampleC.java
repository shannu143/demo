package com.example.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RequestMapping("/api")
@RestController
public class SampleC {
	
	
	@GetMapping("data")
	public String cap() {
		return "sasa";
	}
    
	@PostMapping("/user")
	public ResponseEntity<User> saveStudent(@RequestBody User user) {
		System.out.println(user.toString());
		 return ResponseEntity.ok().body(user);
		
	}
}
