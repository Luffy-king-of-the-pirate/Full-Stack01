package com.example.chatbot.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	
	@GetMapping("/greetings")
	public String message() {
	return ("Hello world...");
}

}
