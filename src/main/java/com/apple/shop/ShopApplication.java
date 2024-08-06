package com.apple.shop;

import com.apple.shop.domain.MyInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {


	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
		MyInfo myInfo = new MyInfo("chaeyeon",22);

	}

}


