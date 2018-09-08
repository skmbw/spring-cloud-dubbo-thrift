package com.xueershangda.xueapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:application-dubbo-consumer.xml")
@SpringBootApplication(scanBasePackages = "com.xueershangda")
public class XueApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(XueApiApplication.class, args);
	}
}
