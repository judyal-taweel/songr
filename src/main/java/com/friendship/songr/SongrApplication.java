package com.friendship.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SongrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);

HelloController control=new HelloController();

control.hello();
	}

}
