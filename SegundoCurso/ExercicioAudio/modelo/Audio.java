package SegundoCurso.ExercicioAudio.modelo;

public class Audio {
    //Atributos - Encapsulados
    protected String titulo;
    protected int totalReproducoes;
    protected int curtidas;
    protected int classificacao;
    protected int duracao; //em minutos
    protected boolean rodando=false;

    //Métodos Acessores e Modificadores
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    private void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public int getDuracao(){
        return this.duracao;
    }

    private void setTotalReproducoes(int totalReproducoes){
        this.totalReproducoes = totalReproducoes;
    }
    public int getTotalReproducoes(){
        return this.totalReproducoes;
    }

    private void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }
    public int getCurtidas(){
        return this.curtidas;
    }

    private void setRodando(boolean rodar){
        this.rodando = rodar;
    }
    public boolean getRodando(){
        return this.rodando;
    }

    private void setClassificacao(int classificacao){
        this.classificacao = classificacao;
    }
    public int getClassificacao(){
        return this.classificacao;
    }

    //Métodos da Classe 
    public void curtir(){
        curtidas = curtidas + 1;
    }

    public void reproduz(){
        this.setTotalReproducoes(this.getTotalReproducoes()+1);
    }


    
}
