package com.espo.uploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.espo.uploader.uploadfile.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)  //collegamento con le proprietà
public class Uploader2Application {

	public static void main(String[] args) {
		SpringApplication.run(Uploader2Application.class, args);
	}

}
