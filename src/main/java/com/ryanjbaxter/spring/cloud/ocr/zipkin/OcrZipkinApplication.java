package com.ryanjbaxter.spring.cloud.ocr.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class OcrZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrZipkinApplication.class, args);
	}
}
