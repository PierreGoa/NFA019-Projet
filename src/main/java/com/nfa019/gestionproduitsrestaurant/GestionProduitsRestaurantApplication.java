package com.nfa019.gestionproduitsrestaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication(scanBasePackages="com.nfa019")
public class GestionProduitsRestaurantApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionProduitsRestaurantApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
