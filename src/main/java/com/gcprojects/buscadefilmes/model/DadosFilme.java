package com.gcprojects.buscadefilmes.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosFilme(@JsonAlias("Title") String Titulo,
                         @JsonAlias("Year") Integer anoLancamento,
                         @JsonAlias("Genre") String genero,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("Director") String diretor,
                         @JsonAlias("Runtime")String duracaoEmMin)
                         {

}
