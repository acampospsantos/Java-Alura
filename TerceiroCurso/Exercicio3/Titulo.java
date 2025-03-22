package TerceiroCurso.Exercicio3;

public class Titulo implements Comparable<Titulo>{
    
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        return "Nome do título = " + this.nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo){
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
