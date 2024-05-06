package com.icici.webappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebappDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappDemoApplication.class, args);
	}

	@GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
	
	@GetMapping("/hello")//developer-2 code change +//ramesh code changes 
    public String helloWorld() {
      return String.format("Hello there welcome to my webpage");
    }
}
