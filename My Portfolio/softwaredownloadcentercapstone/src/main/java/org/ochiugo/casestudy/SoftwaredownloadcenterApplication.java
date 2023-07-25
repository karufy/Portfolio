package org.ochiugo.casestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// The @Springbootapplication annotation is confirmation of using spring initialzr.
// It is a combination of Configuration-returns the beans, EnableAutoConfiguration-enables auto configurations and ComponentScan-to scan the components
@SpringBootApplication
public class SoftwaredownloadcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwaredownloadcenterApplication.class, args);
	}

}
