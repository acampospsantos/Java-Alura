package TerceiroCurso.ExercicioFinal;

public class Produto implements Comparable<Produto> {
    String descricao;
    double preco;

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco() {
        return this.preco;
    }

    @Override 
    public String toString(){
        return "Produto = " + this.getDescricao() + " , R$" + this.getPreco();
    }

    @Override
    public int compareTo(Produto outroProduto){
        return Double.compare(this.preco, outroProduto.preco);
    }
}
