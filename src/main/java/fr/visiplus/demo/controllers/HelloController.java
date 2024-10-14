package fr.visiplus.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.visiplus.demo.services.HelloService;

@RestController
public class HelloController {
	
	private HelloService helloService;
	
	public HelloController(final HelloService helloService) {
		this.helloService = helloService;
	}
	
	@GetMapping("")
	public String getHello() {
		return helloService.cleanValue("Hello ");
	}
	
	@GetMapping("/first")
	public String getFirst() {
		String value = helloService.getFirstElement();
		return helloService.cleanValue(value);
	}

}
