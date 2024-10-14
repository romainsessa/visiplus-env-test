package fr.visiplus.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import fr.visiplus.demo.services.HelloService;

@SpringBootTest
//@ExtendWith(MockitoExtension.class)
public class HelloControllerTest {
	
	@Mock
	private HelloService helloService;
	
	
	@Test
	public void testGetFirst() {
		//Arrange
		HelloController helloController = new HelloController(helloService);
		String expectedResult = "test";
		
		when(helloService.getFirstElement()).thenReturn(" TEST ");
		when(helloService.cleanValue(" TEST ")).thenReturn("test");
		
		//Act
		String result = helloController.getFirst();
		
		
		//Assert
		assertEquals(expectedResult, result);
				
	}

}
