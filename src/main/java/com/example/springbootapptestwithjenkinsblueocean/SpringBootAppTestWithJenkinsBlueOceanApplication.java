package com.example.springbootapptestwithjenkinsblueocean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppTestWithJenkinsBlueOceanApplication {

	public static void main(String[] args) {
		// TODO should be detected by the Jenkins opened task scanner
		SpringApplication.run(SpringBootAppTestWithJenkinsBlueOceanApplication.class, args);
	}
}
