package SegundoCurso.ExercicioAudio.modelo;

public class Musica extends Audio{
    //Atributos (Encapsulados)
    private String album;
    private String artista;
    private String genero;

    //Métodos Acessores e Modificadores
    public void setAlbum(String album){
        this.album = album;
    }
    public String getAlbum(){
        return this.album;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }
    public String getArtista(){
        return this.artista;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }


    //Métodos da Classe
    @Override
    public int getClassificacao(){
        if(this.getTotalReproducoes() > 200){
            return 10;
        } else {
            return 7;
        }
    }
}
