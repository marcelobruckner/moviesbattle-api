package br.com.moviesbattle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class MovieQuizz {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @EqualsAndHashCode.Include
  private Long id;

  @Column(nullable = true)
  private String resposta;

  @Column(nullable = true)
  private Long idUsuario;

  @Column(nullable = true)
  private String movie1;

  @Column(nullable = true)
  private String movie2;

  @Column(nullable = true)
  private Long notaMovie1;

  @Column(nullable = true)
  private Long notaMovie2;
}
