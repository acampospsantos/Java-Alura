package QuartoCurso.Screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import QuartoCurso.Screenmatch.modelos.Titulo;
import QuartoCurso.Screenmatch.modelos.Filme;
import QuartoCurso.Screenmatch.modelos.Serie;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970); //INSTANCIAÇÃO DO OBJETO
        Filme outroFilme = new Filme("Avatar", 2023); //INSTANCIAÇÃO DO OBJETO
        Filme filmeDoPaulo = new Filme("Dogville", 2010);
        Serie peakyBlinders = new Serie("Peaky Blinders", 2020);

        meuFilme.avalia(8);
        outroFilme.avalia(6);
        filmeDoPaulo.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(peakyBlinders);

        /*
         for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getNome());
            Filme filme = (Filme) lista.get(i);
            System.out.println("Classificação " + filme.getClassificacao());
        } 
         */
        //foreach
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme){
                Filme filme = (Filme) item;
                if(filme.getClassificacao() > 2){
                    System.out.println("Classificação " + filme.getClassificacao());
                }
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Jacque");
        System.out.println(buscaPorArtistas);
        
        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtistas);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: ");
        System.out.println(lista);
        
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //???
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}
