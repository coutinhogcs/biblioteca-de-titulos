package com.gcprojects.buscadefilmes.model;

public class Filme {
private String titulo;
private Integer ano;
private String genero;
private String avaliacao;
private String diretor;
private String duracao;

    public Filme(DadosFilme dadosFilme) {
        this.titulo = dadosFilme.Titulo();
        this.ano = dadosFilme.anoLancamento();
        this.genero = dadosFilme.genero();
        this.avaliacao = dadosFilme.avaliacao();
        this.diretor = dadosFilme.diretor();
        this.duracao = dadosFilme.duracaoEmMin();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "\nFilme:"
                +"\nTitulo : "+titulo +
                "\nGenero: " + genero +
                "\nAno: " + ano +
                "\nDiretor: " + diretor +
                "\nAvaliação: " + avaliacao
                ;
    }
}
