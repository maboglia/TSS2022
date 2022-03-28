package com.boglia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.boglia.uploadfile.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploaderApplication.class, args);
	}

}
