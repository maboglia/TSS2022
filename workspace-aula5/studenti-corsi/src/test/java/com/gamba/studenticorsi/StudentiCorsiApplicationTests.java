package com.gamba.studenticorsi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gamba.studenticorsi.entities.Esame;
import com.gamba.studenticorsi.services.ScuolaService;

@SpringBootTest
class StudentiCorsiApplicationTests {

	@Autowired
	private ScuolaService service;
	
	
	@Test
	void contextLoads() {
		service.addEsame(new Esame("Francese A", "FRA", 12));
		
//		assertTrue(service.getEsameById(1).getCrediti()==12);
//		assertTrue(service.getEsameById(1).getCrediti()==10);
	
	}

}
