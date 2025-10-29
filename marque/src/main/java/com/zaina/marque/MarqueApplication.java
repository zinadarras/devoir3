package com.zaina.marque;

import com.zaina.marque.entities.Marque;
import com.zaina.marque.repos.MarqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MarqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarqueApplication.class, args);
	}


    @Bean
    CommandLineRunner commandLineRunner(MarqueRepository marqueRepository) {
        return args -> {
            marqueRepository.save(Marque.builder()
                    .nom("BMW")
                    .codeMarque("BM")
                    .build());
            marqueRepository.save(Marque.builder()
                    .nom("Mercedes")
                    .codeMarque("MER")
                    .build());

        };
    }

}
