package br.com.moviesbattle.service;

import java.net.URI;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.moviesbattle.model.MovieModel;

@Service
public class MovieExternoService {
  private static final String URL = "http://www.omdbapi.com/";
  private static final String RESOURCE_PATH = "/?apikey=61566210";

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private List<String> listMovies;

  public MovieModel findById(String id) {
    String paramId = "&i=" + id;
    URI resourceURI = URI.create(URL + RESOURCE_PATH + paramId);
    MovieModel movie = restTemplate.getForObject(resourceURI, MovieModel.class);

    listMovies.get(new Random().nextInt(11));

    return movie;
  }
}
