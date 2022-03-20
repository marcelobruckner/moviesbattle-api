package br.com.moviesbattle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.moviesbattle.model.MovieQuizz;

public interface MovieQuizzRepository extends JpaRepository<MovieQuizz, Long> {

}
