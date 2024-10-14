package fr.visiplus.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String cleanValue(final String value) {

		return value.toLowerCase().strip();
		
	}
	
	
}
