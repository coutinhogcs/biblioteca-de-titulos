package com.gcprojects.buscadefilmes.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String Titulo,
                         @JsonAlias("Genre") String genero,
                         @JsonAlias("Year") String anoLancamento,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("totalSeasons") String temporadas)
{

}
