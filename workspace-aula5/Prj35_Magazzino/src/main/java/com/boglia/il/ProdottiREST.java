package com.boglia.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Prodotto;
import com.boglia.services.ProdottoService;

@RestController
public class ProdottiREST {

	@Autowired
	private ProdottoService service;
	
	@GetMapping
	public List<Prodotto> getAll(){
		return service.getProdotti();
	}
	
	@PostMapping
	public void addProdotto(@RequestBody Prodotto p) {
		service.addProdotto(p);
		getAll();
	}
	
}
