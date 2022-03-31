package com.espo.uploader.controller;

import java.nio.file.Files;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.espo.uploader.uploadfile.StorageService;

@Controller
@RequestMapping("docs")
public class StorageController {

	@Autowired
	private StorageService service;
	
	@PostMapping
	public String caricaFile(@RequestParam("file") MultipartFile file) {
		service.store(file);
		
		return "redirect:/docs";
	}
	

	
	@GetMapping("/docs/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> showFile(@PathVariable String filename){
		Resource file = service.loadAsResource(filename);
		
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename='" + file.getFilename() + "'")
				.body(file);
	}
	
	@GetMapping
	public String listFiles(Model m){
		m.addAttribute("files", service.loadAll().map(path -> MvcUriComponentsBuilder
							.fromMethodName(StorageController.class, "showFile", path.getFileName().toString())
							.build().toUri().toString()).collect(Collectors.toList()));
		
		return "documenti";
	}
	
	
	
	
	
	
}
