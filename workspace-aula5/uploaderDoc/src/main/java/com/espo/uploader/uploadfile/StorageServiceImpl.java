package com.espo.uploader.uploadfile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageServiceImpl implements StorageService {

	private final Path location;
	
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
			if(file.isEmpty()) {
				throw new Exception("Il file è vuoto");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		Path destinazione = this.location.resolve(Paths.get(file.getOriginalFilename())).normalize().toAbsolutePath();
		//try with resource, saranno automaticamente chiuse
		try(InputStream is = file.getInputStream();) {
			Files.copy(is, destinazione, StandardCopyOption.REPLACE_EXISTING);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Stream<Path> loadAll() {
		
		try {
			return Files.walk(this.location, 1).filter(path -> !path.equals(this.location)).map(this.location::relativize);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Path load(String filename) {
		
		return this.location.resolve(filename); 
	}

	@Override
	public Resource loadAsResource(String filename) {
		try {
			Path file = load(filename);
			Resource resource = new UrlResource(file.toUri());
			if(resource.exists() || resource.isReadable()) {
				return resource;
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
