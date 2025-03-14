package SegundoCurso.Screenmatch.modelos;

import SegundoCurso.Screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao{
    // Atributos - (ENCAPSULAMENTO)
    private String diretor;

    //Método CONSTRUTOR

    //Métodos Acessores e Modificadores
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getDiretor(){
        return this.diretor;
    }
    
    // Métodos da classe
    //Método implementado da Interface
    @Override
    public int getClassificacao(){
        double nota = media() / 2;
        return (int)nota;
    }
}
