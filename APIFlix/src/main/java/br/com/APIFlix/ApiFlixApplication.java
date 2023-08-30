package br.com.APIFlix;

import br.com.APIFlix.model.DadosSerie;
import br.com.APIFlix.services.ConsumoAPI;
import br.com.APIFlix.services.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiFlixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiFlixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=supernatural&apikey=149e891b");
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
