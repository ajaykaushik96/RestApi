package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LaptopController {
	
	@Autowired
	Laptop lc;
	
	@GetMapping("/Message")
	public Laptop lappy ()
	{
		lc.setLid(122);
		lc.setLname("Dell");
		return lc;
	}
	
}
