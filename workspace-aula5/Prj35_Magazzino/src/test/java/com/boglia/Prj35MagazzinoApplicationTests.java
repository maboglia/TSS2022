package com.boglia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boglia.entities.Prodotto;
import com.boglia.services.ProdottoService;

@SpringBootTest
class Prj35MagazzinoApplicationTests {

	@Autowired
	private ProdottoService service;
	
	@Test
	void contextLoads() {
		//Prodotto prodotto = new Prodotto();
		//prodotto.setNome("pc");
		//prodotto.setQuantita(100);
		
		//service.addProdotto(prodotto);
		
		//List<Prodotto> prodotti = service.getProdotti();
		
		//System.out.println(service.getProdottoById(1));
		//assertTrue(prodotti.get(0).getNome().equals("pc"));
		
		
	}

}
