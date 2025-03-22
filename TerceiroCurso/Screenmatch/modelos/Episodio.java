package TerceiroCurso.Screenmatch.modelos;

import TerceiroCurso.Screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao{
    //Atributos - (ENCAPSULAMENTO)
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    //Método CONSTRUTOR

     //Métodos Acessores e Modificadores
     public void setNumero(int numero){
        this.numero = numero;
     }
     public int getNumero(){
        return this.numero;
     }

     public void setNome(String nome){
        this.nome = nome;
     }
     public String getNome(){
        return this.nome;
     }

     public void setSerie(Serie serie){
        this.serie = serie;
     }
     public Serie getSerie(){
        return this.serie;
     }

     public void setTotalVisualizacoes(int totalVisualizacoes){
        this.totalVisualizacoes = totalVisualizacoes;
     }
     public int getTotalVisualizacoes(){
        return this.totalVisualizacoes;
     }

     // Métodos da classe    
     @Override
     public int getClassificacao(){
        if(totalVisualizacoes > 100){
            return 4;
        } else {
            return 2;
        }
     }
}
