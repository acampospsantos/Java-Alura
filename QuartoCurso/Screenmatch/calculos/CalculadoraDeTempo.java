package QuartoCurso.Screenmatch.calculos;

import QuartoCurso.Screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    
    //Atributos
    private int tempoTotal = 0;

    //Métodos Acessores e Modificadores
    public int getTempoTotal(){
        return tempoTotal;
    }

    /*
     public void inclui(Filme filme){
        tempoTotal = tempoTotal + filme.getDuracao(); 
    }

    public void inclui(Serie serie){
        tempoTotal = tempoTotal + serie.getDuracao(); 
    }
    */
    public void inclui(Titulo titulo){
        this.tempoTotal = tempoTotal + titulo.getDuracao(); 
    }
}
