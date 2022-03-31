package com.espo.uploader.uploadfile;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {

	void init();
	void store(MultipartFile file); //tutti i tipi di file
	Stream<Path> loadAll(); //carica tutti i file e lo inserisce in uno stream di percorsi
	Path load(String filename);
	Resource loadAsResource(String filename);
	void deleteAll();
	
	
}
