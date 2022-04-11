package com.boglia;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.boglia.entities.Cliente;
import com.boglia.entities.Viaggio;
import com.boglia.repos.ClienteRepo;
import com.boglia.repos.ViaggioRepo;

@SpringBootApplication
public class RelazioniTabelleJpaApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(RelazioniTabelleJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner prova(ClienteRepo repoc, ViaggioRepo repov) {
		
		return (a) -> {
				
			
				Viaggio v = new Viaggio();
				Cliente c = new Cliente();
				Cliente c1 = new Cliente("Ari", "arighi", "ari@arighi.com");
				Cliente c2 = new Cliente("Mari", "marighi", "mari@marighi.com");
				c.setNome("fabio");
				c.setCognome("amoruso");
				c.setEmail("jdkhòhfòoahò");
				
				Set<Cliente> clienti = new HashSet<>();
				
//				clienti.add(c);
				clienti.add(c);
				clienti.add(c1);
				clienti.add(c2);
				
				v.setDestinazione("Parigi");				
				v.setGenere("romantico");
				v.setCliente(clienti);
				c.setViaggio(v);
				c1.setViaggio(v);
				c2.setViaggio(v);
//				repoc.save(c);
				repov.save(v);
				
			};
		
		
	}
	
	
}
