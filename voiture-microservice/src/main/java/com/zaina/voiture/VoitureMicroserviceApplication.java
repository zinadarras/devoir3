package com.zaina.voiture;

import com.zaina.voiture.entities.Voiture;
import com.zaina.voiture.repos.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class VoitureMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoitureMicroserviceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(VoitureRepository voitureRepository) {
        return args -> {
            voitureRepository.save(Voiture.builder()
                    .couleur("Noir")
                    .immCode("175TUN301")
                    .codeMarque("MER")
                    .build());
        };
    }
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
