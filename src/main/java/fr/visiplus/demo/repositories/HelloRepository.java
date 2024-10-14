package fr.visiplus.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

	private List<String> elements = new ArrayList<String>();
	
	public HelloRepository() {
		elements.add("  HELLO ");
	}
	
	public List<String> getElements() {
		return elements;
	}
	
	public String getElementByIndex(final int index) {
		return elements.get(index);
	}
	
	
}
