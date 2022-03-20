package br.com.moviesbattle;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MoviesbattleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesbattleApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public List<String> listMovies() {
		return Arrays.asList("tt0462499", "tt0479143", "tt2087752", "tt0096895", "tt1670345", "tt0240772", "tt0404390",
				"tt0387564", "tt0080339", "tt0212338", "tt0068646", "tt0343660");
	}
}
