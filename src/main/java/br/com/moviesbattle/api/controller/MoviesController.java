package br.com.moviesbattle.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moviesbattle.model.Battle;
import br.com.moviesbattle.model.MovieQuizz;
import br.com.moviesbattle.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MoviesController {

  @Autowired
  private MovieService movieService;

  // @GetMapping("/iniciar")
  // public Battle startBattle() {
  // return movieService.jogar();
  // }

  @GetMapping("/iniciar")
  public MovieQuizz startQuizz() {
    return movieService.jogar();
  }

  @PostMapping()
  public Battle batalhar(@RequestBody Battle battle) {

    System.out.println(battle);

    return battle;
  }
}
