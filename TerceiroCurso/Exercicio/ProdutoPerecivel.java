package TerceiroCurso.Exercicio;

public class ProdutoPerecivel extends Produto {
    //Atributos
    private int dataValidade;
    
    //Método construtor
    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + ", Preço = R$" + this.getPreco() + " , Quantidade = " + this.getQuantidade() + " , Data Validade = " + this.dataValidade;
    }
}
