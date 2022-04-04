package com.boglia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.boglia.entities.Documento;
import com.boglia.entities.Viaggio;
import com.boglia.repos.DocRepo;
import com.boglia.repos.ViaggioRepo;

@SpringBootApplication
public class RelazioniTabelleApplication {

	@Autowired
	private ViaggioRepo repoV;
	@Autowired
	private DocRepo repoD;
	
	public static void main(String[] args) {
		SpringApplication.run(RelazioniTabelleApplication.class, args);
	}

	@Bean
	public CommandLineRunner esempio1() {
		return a -> {
			
			
			Viaggio v = new Viaggio();
			v.setDestinazione("Roma");
			
			Documento d = new Documento();
			d.setNome("Locandina Roma");
			d.setTipo("pdf");
			d.setPath("/docs/locandina.pdf");
			
			repoV.save(v);
			repoD.save(d);
			
			v.getDocumenti().add(d);
			repoV.save(v);
			
			
			
			
		};
		
		
		
	}
	
}
