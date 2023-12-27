package com.amigos.authenautho.demo;

import com.amigos.authenautho.demo.services.CheckoutService;
import com.amigos.authenautho.demo.services.TrackingOrderServices;
import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
@RequestMapping
public class BookShopV1Demo {

	public static void main(String[] args) {
		SpringApplication.run(BookShopV1Demo.class, args);
	}



}
