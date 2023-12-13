package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseInitializer {
    @Bean
    public CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "ENNAHHAL Bouchra", Float.parseFloat("22")));
            clientRepository.save(new Client(Long.parseLong("2"), "Admin", Float.parseFloat("27")));
        };
    }
}
