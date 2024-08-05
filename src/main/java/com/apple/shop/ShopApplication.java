package com.apple.shop;

import jdk.jfr.Frequency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {


	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);

	}

}

class Friend{
	String name = "chaeyeon";
	int age = 22;
	Friend(String name){
		this.name = "kim";
	}
}


