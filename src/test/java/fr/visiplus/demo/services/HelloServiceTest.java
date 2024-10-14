package fr.visiplus.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class HelloServiceTest {
	
	
	@Autowired
	private HelloService helloService;
	
	@Test
	public void testCleanValue() {
		//Arrange
		String value = " TEst  ";
		String expectedResult = "test";
		
		//Act
		String result = helloService.cleanValue(value);
		
		//Assert
		assertEquals(expectedResult, result);
		
		
		
	}

}
