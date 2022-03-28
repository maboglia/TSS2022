package com.garone.presentation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garone.entities.Ricetta;
import com.garone.services.RicettaService;

@Controller
@RequestMapping("")
public class RicettaMVC {
	@Autowired
	private RicettaService service;
	
	@GetMapping
	public String getHome(Model m,@RequestBody(required = false) Ricetta r) {
		m.addAttribute("titolo","Ricette");
		if(r != null) {
			System.out.println(r.getNome() + "\n" + r.getIngredienti());
			System.out.println(r);
		}
		return "home";
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String getHomePost(Ricetta r,Model m) {
		m.addAttribute("titolo","Ricette");
		if(r != null) {
			System.out.println(r.getNome() + "\n" + r.getIngredienti());
			System.out.println(r);
			service.addRicetta(r);
		}
		return "home";
	}
	
	
	
}
