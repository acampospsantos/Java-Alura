package SegundoCurso.Screenmatch.modelos;

public class Titulo {
    // Atributos - (ENCAPSULAMENTO)
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracao; // Em minutos

    // Método CONSTRUTOR

    // Métodos Acessores e Modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    private void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    private void setSomaDasAvaliacoes(double avaliacaoNova) {
        this.somaDasAvaliacoes = this.somaDasAvaliacoes + avaliacaoNova;
    }

    private double getSomaDasAvaliacoes() {
        return this.somaDasAvaliacoes;
    }

    private void setTotalAvaliacoes(int avaliacoes) {
        this.totalAvaliacoes = this.totalAvaliacoes + avaliacoes;
    }

    public int getTotalAvaliacoes() {
        return this.totalAvaliacoes;
    }

    // Métodos da classe
    public void exibeFichaTecnica() {
        System.out.println("Nome do título: " + this.nome);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
        System.out.println("Duração em minutos: " + this.duracao);
        System.out.println("Incluído no plano: " + this.incluidoNoPlano);
    }

    public void avalia(double nota) {
        this.setSomaDasAvaliacoes(nota); // this.somaDasAvaliacoes = this.somaDasAvaliacoes + nota;
        this.setTotalAvaliacoes(1); // == totalAvaliacoes = totalAvaliacoes + 1;
    }

    public double media() { // Retorna a média geral do filme
        double media = this.getSomaDasAvaliacoes() / this.getTotalAvaliacoes();
        return media;
    }
}
