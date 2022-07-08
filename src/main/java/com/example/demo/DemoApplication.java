package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	InfoRepository infoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping()
	public String index() {
		Info info = new Info();
		info.setMessage("from spring-boot");
		infoRepository.save(info);
		return "にほんごがただしくひょうじ・保存できるか？";
	}
	

}
