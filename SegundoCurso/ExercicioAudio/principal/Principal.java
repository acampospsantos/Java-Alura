package SegundoCurso.ExercicioAudio.principal;

import SegundoCurso.ExercicioAudio.modelo.MinhasPreferidas;
import SegundoCurso.ExercicioAudio.modelo.Musica;
import SegundoCurso.ExercicioAudio.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Your Song");
        minhaMusica.setArtista("Elton John");

        for (int i=0; i<100; i++){
            minhaMusica.reproduz();
        }
        for(int i=0; i<50; i++){
            minhaMusica.curtir();
        }


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow");
        meuPodcast.setHost("Igor 3K");

        for (int i=0; i<1000; i++){
            meuPodcast.reproduz();
        }
        for (int i=0; i<500; i++){
            meuPodcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);
    }
}
