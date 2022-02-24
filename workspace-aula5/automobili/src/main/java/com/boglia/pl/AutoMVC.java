package com.boglia.pl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boglia.service.AutoService;

@Controller
@RequestMapping({"MVC", "auto", "sito"})
public class AutoMVC {

	@Autowired
	private AutoService service;
	
	@GetMapping
	public String getAutomobili(Model m) {
		m.addAttribute("pippo", "Le mie auto usate");
		m.addAttribute("automobili", service.getAll());
		return "nomeVista";
	}
	
}
