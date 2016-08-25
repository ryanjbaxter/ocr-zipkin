package com.example;

import com.ryanjbaxter.spring.cloud.ocr.zipkin.OcrZipkinApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OcrZipkinApplication.class)
public class ZipkinDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
