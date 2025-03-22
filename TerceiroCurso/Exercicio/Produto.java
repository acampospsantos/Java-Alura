package TerceiroCurso.Exercicio;

public class Produto {
    //Atributos - encapsulados
    private String nome;
    private double preco;
    private int quantidade;

    //Método Construtor
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Métodos acessores e modificadores
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getQuantidade(){
        return this.quantidade;
    }


    //Métodos da classe
    @Override
    public String toString(){
        return "Nome: " + this.nome + ", Preço = R$" + this.preco + " , Quantidade = " + this.quantidade;
    }
}
