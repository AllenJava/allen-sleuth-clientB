package com.allen;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
	
	private final Logger logger=Logger.getLogger(getClass());
	
	@RequestMapping(value="/createMessage",method=RequestMethod.GET)
	public String createMessage(){
		logger.info("== call clientB ==");
		return "message["+System.currentTimeMillis()+"]";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
