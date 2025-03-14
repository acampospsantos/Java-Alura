package SegundoCurso.ExercicioAudio.modelo;

public class Podcast extends Audio{
    //Atributos (Encapsulados)
    private String host;
    private String descricao;

    //Métodos Acessores e Modificadores
    public void setHost(String host){
        this.host = host;
    }
    public String getHost(){
        return this.host;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    @Override
    public int getClassificacao(){
        if(this.curtidas > 500){
            return 10;
        } else {
            return 8;
        }
    }

}
