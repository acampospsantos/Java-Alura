package QuartoCurso.Screenmatch.principal;

import java.util.ArrayList;

import QuartoCurso.Screenmatch.calculos.CalculadoraDeTempo;
import QuartoCurso.Screenmatch.calculos.FiltroRecomendacao;
import QuartoCurso.Screenmatch.modelos.Episodio;
import QuartoCurso.Screenmatch.modelos.Filme;
import QuartoCurso.Screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970); //INSTANCIAÇÃO DO OBJETO
        meuFilme.setDuracao(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracao());

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        
        Serie peakyBlinders = new Serie("Peaky Blinders", 2020);
        peakyBlinders.setTemporadas(4);
        peakyBlinders.setEpisodiosPorTemporada(10);
        peakyBlinders.setMinutosPorEpisodio(50);
        peakyBlinders.exibeFichaTecnica();
        System.out.println("Duração para maratonar Peaky Blinders: " + peakyBlinders.getDuracao());


        Filme outroFilme = new Filme("Avatar", 2023); //INSTANCIAÇÃO DO OBJETO
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

        Filme filmeDoPaulo = new Filme("Dogville", 2010); //var filmeDoPaulo = new Filme(); ---> o "var" realiza uma inferência do tipo declarado
        filmeDoPaulo.setDuracao(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);
        listaFilmes.add(filmeDoPaulo);
        System.out.println("Tamanho da lista = " + listaFilmes.size());
        System.out.println("Primeiro  da lista: " + listaFilmes.get(0).getNome());
        System.out.println("toString do filme " + listaFilmes.get(0).toString());

        //Impressão do ArrayList
        System.out.println("Lista de filmes: " + listaFilmes);

        //int[] numeros = new int[5]; --> Sintaxa array criado em Java(limitado pq já tem que definir o tamanho do array)
    }
}
