package com.gcprojects.buscadefilmes.principal;

import com.gcprojects.buscadefilmes.model.DadosFilme;
import com.gcprojects.buscadefilmes.model.DadosSerie;
import com.gcprojects.buscadefilmes.model.Filme;
import com.gcprojects.buscadefilmes.model.Serie;
import com.gcprojects.buscadefilmes.service.ConsumoAPI;
import com.gcprojects.buscadefilmes.service.ConverteDados;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConverteDados converte = new ConverteDados();
    private ConsumoAPI consome = new ConsumoAPI();

    private final String URL = "https://www.omdbapi.com/?t=";
    private final String API_KEY ="&apikey=f9c137a3";

    public void exibeMenu(){
        var menu = """
                
                ****************************************
                BLIBIOTECA DE DADOS:
                
                1 - FILMES
                2 - SERIES
                3 - SAIR
                
                ****************************************
                """; System.out.println(menu);
        var opcao = leitura.nextInt();
        while (opcao != 3) {

            if (opcao == 1) {
                System.out.println("""
                        ****** FILMES ******
                        Digite o filme desejado:
                        """);
                leitura.nextLine();
                var nomeFilme = leitura.nextLine();
                var json = consome.obterDados(URL + nomeFilme.replace(" ", "+") + API_KEY);
                DadosFilme dadosFilme = converte.obterDados(json, DadosFilme.class);

                Filme filmes = new Filme(dadosFilme);
                filmes.toString();
                System.out.println(filmes);
            } else if (opcao == 2) {
                System.out.println("""
                        ****** SERIES ******
                        Digite a serie desejada:
                        """);
                leitura.nextLine();
                var nomeSerie = leitura.nextLine();
                var json = consome.obterDados(URL + nomeSerie.replace(" ", "+") + API_KEY);
                DadosSerie dadosSerie = converte.obterDados(json, DadosSerie.class);

                Serie series = new Serie(dadosSerie);
                series.toString();
                System.out.println(series);

            }
        }

    }
}
