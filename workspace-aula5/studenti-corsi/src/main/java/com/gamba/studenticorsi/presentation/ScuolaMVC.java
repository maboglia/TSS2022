package com.gamba.studenticorsi.presentation;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gamba.studenticorsi.entities.Esame;
import com.gamba.studenticorsi.entities.Studente;
import com.gamba.studenticorsi.entities.StudentiEsami;
import com.gamba.studenticorsi.services.ScuolaService;

@Controller
@RequestMapping("")
public class ScuolaMVC {

	
	
	@Autowired
	private ScuolaService service;
	
	@GetMapping({"studenti", ""})
	public String getStudenti(Model m) {
		m.addAttribute("titolo", "Studenti");
		m.addAttribute("studenti",service.getStudenti());
		return "studenti";
	}
	
	@GetMapping("esami")
	public ModelAndView getEsami() {
		ModelAndView mav = new ModelAndView("addEsami");
		mav.addObject("esami", service.getEsami());
		mav.addObject("studenti", service.getStudenti());
		mav.addObject("titolo", "Aggiungi esame");
		return mav;
	}
		
		@GetMapping("corsi")
		public ModelAndView getCorsi() {
			ModelAndView mav = new ModelAndView("corsi");
			mav.addObject("corsi", service.getEsami());
			mav.addObject("titolo", "Corsi");
			return mav;
		}
	@GetMapping("studentiesami")
	public List<StudentiEsami> getStudentiEsami() {
		return service.getStudentiEsami();
	}
	
	@GetMapping("studenti/{id}")
	public ModelAndView getEsamiByStudente(@PathVariable int id){
		ModelAndView mav = new ModelAndView("dettaglio");
		Studente s = service.getStudenteById(id);
		mav.addObject("studente", s);
		List<StudentiEsami> e = service.getEsameByStudenteSuper(s);
		mav.addObject("esami", e);
		return mav;
	}
	@GetMapping("studentebyesame/{id}")
	public List<Studente> getStudenteByEsame(@PathVariable int id){
		return service.getStudenteByEsame(service.getEsameById(id));
	}
	
	//@ResponseBody
	@PostMapping(value = "addvoto", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String addVoto(StudentiEsami se) {
		service.addStudenteEsame(se);
		return "redirect:studenti";
	}
	
	@ModelAttribute("etichette")
	public List<String> etichette(){
		return Arrays.asList("studenti","esami","corsi");
	}
	
}
