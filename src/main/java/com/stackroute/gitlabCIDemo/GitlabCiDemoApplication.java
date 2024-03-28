package com.stackroute.gitlabCIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitlabCiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitlabCiDemoApplication.class, args);
	}

	@GetMapping("users")
	public String getUser(){
		return "Hello All Users";
	}
	@GetMapping("admin")
	public String getAdmin(){
		return "Hello Admin";
	}

}
