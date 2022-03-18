package com.boglia.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Prodotto;
import com.boglia.services.ProdottoService;

@RestController
public class ProdottiREST {

	@Autowired
	private ProdottoService service;
	
	@GetMapping("prodotti")
	public List<Prodotto> getAll(){
		System.out.println("GET--------------------");
		return service.getProdotti();
	}
	
	@GetMapping("prodotti/{id}")
	public Prodotto getOne(@PathVariable int id){
		System.out.println("GET ONE--------------------");
		return service.getProdottoById(id);
	}
	
	@PostMapping("prodotti")
	public void addProdotto(@RequestBody Prodotto p) {
		service.addProdotto(p);
		
		System.out.println("POST-----------------------"+p);
		getAll();
	}
	
	@PutMapping("prodotti/{id}")//endpoint 
	public void updProdotto(@PathVariable int id, @RequestBody Prodotto p) {
		
		Prodotto prodottoById = service.getProdottoById(id);
		
		prodottoById = p;
		
		service.updProdotto(prodottoById);
		
		System.out.println("PUT-----------------------"+p);
		getAll();
	}

	@DeleteMapping("prodotti/{id}")
	public void delProdotto(@PathVariable int id) {
		service.delProdottoById(id);
		
		System.out.println("DELETE-----------------------"+id);
		getAll();
	}
	
}
