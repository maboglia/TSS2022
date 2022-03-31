package com.espo.uploader.uploadfile;

import org.springframework.boot.context.properties.ConfigurationProperties;

//configura le proprietà

@ConfigurationProperties("storage")
public class StorageProperties {

	private String location = "docs";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	
	
}
