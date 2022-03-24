package com.healthcare.covido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RestController
public class CovidoApplication implements  WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(CovidoApplication.class, args);
	}
	
	@GetMapping("/helath")
	public String getHealthcheck()
	{
		return "UP";
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/doctores").setViewName("doctores");
		registry.addViewController("/contact").setViewName("contact");
		registry.addViewController("/action").setViewName("action");
		registry.addViewController("/news").setViewName("news");
		registry.addViewController("/about").setViewName("about");
	}
}
