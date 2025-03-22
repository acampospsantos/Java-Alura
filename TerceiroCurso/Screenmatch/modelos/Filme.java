package TerceiroCurso.Screenmatch.modelos;

import TerceiroCurso.Screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao{
    // Atributos - (ENCAPSULAMENTO)
    private String diretor;

    //Método CONSTRUTOR
    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

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

    @Override
    public String toString(){
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
