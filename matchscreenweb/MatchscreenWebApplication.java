package br.com.alphaflix.matchscreenweb;

import br.com.alphaflix.matchscreenweb.principal.Principal;
import br.com.alphaflix.matchscreenweb.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatchscreenWebApplication{

	public static void main(String[] args) {
		SpringApplication.run(MatchscreenWebApplication.class, args);
	}

}
