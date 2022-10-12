package com.chandra.JenkinPipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/hello")
	public String helloMsg() {
		return "Welcome to Jenkins Pipeline";
	}

}
