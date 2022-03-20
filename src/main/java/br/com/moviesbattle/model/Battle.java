package br.com.moviesbattle.model;

import java.util.List;

import br.com.moviesbattle.dto.MovieDTO;
import lombok.Data;

@Data
public class Battle {
  private List<MovieDTO> filmes;
  private String usuario;
  private Long acertos;
  private Long erros;
}
