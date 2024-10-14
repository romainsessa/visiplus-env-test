package fr.visiplus.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.visiplus.demo.repositories.HelloRepository;

@Service
public class HelloService {
	
	private HelloRepository helloRepository;
	
	public HelloService(final HelloRepository helloRepository) {
		this.helloRepository = helloRepository;
	}
	
	public List<String> getElements() {
		return helloRepository.getElements();
	}
	
	public String getFirstElement() {
		return helloRepository.getElementByIndex(0);
	}

	public String cleanValue(final String value) {

		return value.toLowerCase().strip();
		
	}
	
	
}
