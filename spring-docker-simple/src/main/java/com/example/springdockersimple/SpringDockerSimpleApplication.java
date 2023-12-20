package com.example.springdockersimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController; 

@SpringBootApplication
public class SpringDockerSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerSimpleApplication.class, args);
	}

}
@RestController  
class HelloDockerController {  
  
    @GetMapping("/")  
    public String hello() {  
        return "Hello Docker!";  
    }  
}  
