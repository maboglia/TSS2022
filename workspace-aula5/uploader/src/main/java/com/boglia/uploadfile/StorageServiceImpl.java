package com.boglia.uploadfile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageServiceImpl implements StorageService {

	private final Path location;
	
	@Autowired
	public StorageServiceImpl(StorageProperties properties) {
		this.location = Paths.get(properties.getLocation());
	}
	
	
	@Override
	public void init() {
		try {
			Files.createDirectories(location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void store(MultipartFile file) {
		
		try {
		
			if (file.isEmpty()) {
				throw new Exception("Il file è vuoto, non posso caricarlo");
			} 

			Path destinazione = this.location.resolve(Paths.get(file.getOriginalFilename()))
					.normalize()
					.toAbsolutePath();
			
			try(InputStream is = file.getInputStream()){
				Files.copy(is, destinazione, StandardCopyOption.REPLACE_EXISTING);
				
				System.out.println("il file è stato caricato con successo!");
			}
			
			
			
		}
		
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	@Override
	public Stream<Path> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path load(String filename) {
		return location.resolve(filename);
	}

	@Override
	public Resource loadAsResource(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
