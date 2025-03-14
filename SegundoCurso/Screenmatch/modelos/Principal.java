package SegundoCurso.Screenmatch.modelos;

import SegundoCurso.Screenmatch.calculos.CalculadoraDeTempo;
import SegundoCurso.Screenmatch.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); //INSTANCIAÇÃO DO OBJETO
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracao(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracao());

        //meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        Serie peakyBlinders = new Serie();
        peakyBlinders.setNome("Peaky Blinders");
        peakyBlinders.setAnoDeLancamento(2020);
        peakyBlinders.setTemporadas(4);
        peakyBlinders.setEpisodiosPorTemporada(10);
        peakyBlinders.setMinutosPorEpisodio(50);
        peakyBlinders.exibeFichaTecnica();
        System.out.println("Duração para maratonar Peaky Blinders: " + peakyBlinders.getDuracao());


        Filme outroFilme = new Filme(); //INSTANCIAÇÃO DO OBJETO
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracao(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(peakyBlinders);
        System.out.println(calculadora.getTempoTotal() + "min");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme); //Relacionamento entre objetos

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(peakyBlinders);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
