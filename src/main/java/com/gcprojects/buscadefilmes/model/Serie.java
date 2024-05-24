package com.gcprojects.buscadefilmes.model;
public class Serie {
    private String titulo;
    private String genero;
    private String ano;
    private Double avaliacao;
    private Integer totalTemporadas;

    public Serie( DadosSerie serie) {
        this.titulo = serie.Titulo();
        this.genero = serie.genero();
        this.ano = serie.anoLancamento();
        this.avaliacao = Double.valueOf(serie.avaliacao());
        this.totalTemporadas = Integer.valueOf(serie.temporadas());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }
    @Override
    public String toString() {
        return "\nSerie:"
                +"\nTitulo : "+titulo +
                "\nGenero: " + genero +
                "\nAno: " + ano +
                "\nAno de transmissão: " + ano +
                "\nAvaliação: " + avaliacao
                ;
    }
}
