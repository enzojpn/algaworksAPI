package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.api.controller.TestaMockito;

@SpringBootTest
class AlgaworksApiApplicationTests {

	@Test
	void contextLoads() {
		
		TestaMockito m = mock(TestaMockito.class);
		when(m.soma(1, 1)).thenReturn(11);
		TestaMockito tm = new TestaMockito();  
		int r = m.soma(1, 1);
		r= tm.soma(1, 1);
		assertEquals(2, r);
	}

}
