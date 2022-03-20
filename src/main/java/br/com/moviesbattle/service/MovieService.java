package br.com.moviesbattle.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.moviesbattle.dto.MovieDTO;
import br.com.moviesbattle.model.MovieModel;
import br.com.moviesbattle.model.MovieQuizz;
import br.com.moviesbattle.repository.MovieQuizzRepository;

@Service
public class MovieService {

  @Autowired
  private List<String> listMovies;

  @Autowired
  private MovieExternoService movieExternoService;

  @Autowired
  private MovieQuizzRepository repository;

  private MovieModel obterProximoFilme() {

    return movieExternoService.findById(getNextMovieId());
  }

  private String getNextMovieId() {
    return listMovies.get(new Random().nextInt(11));
  }

  private MovieDTO obterFilmeResumido(MovieModel model) {
    return new MovieDTO(model.getImdbID(), model.getTitle());
  }

  public MovieQuizz jogar() {
    MovieQuizz quizz = new MovieQuizz();

    List<MovieDTO> filmes = obterFilmesValidos();

    quizz.setMovie1(filmes.get(0).getNome());
    quizz.setMovie2(filmes.get(1).getNome());

    quizz.setIdUsuario(1L);
    quizz.setNotaMovie1(8L);
    quizz.setNotaMovie2(9L);

    return repository.save(quizz);

  }

  public List<MovieDTO> obterFilmesValidos() {
    List<MovieDTO> filmesValidos = new ArrayList<>();

    MovieDTO filme_1 = obterFilmeResumido(obterProximoFilme());
    MovieDTO filme_2 = obterFilmeResumido(obterProximoFilme());

    filmesValidos.add(filme_1);
    filmesValidos.add(filme_2);

    if (!filmesValidos(filme_1, filme_2)) {
      obterFilmesValidos();
    }

    return filmesValidos;

  }

  private boolean filmesValidos(MovieDTO filme_1, MovieDTO filme_2) {
    return !filme_1.equals(filme_2);
  }
}
