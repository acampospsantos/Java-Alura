package TerceiroCurso.Exercicio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Arroz", 10, 100);
        Produto produto2 = new Produto("Feijão", 8, 80);
        Produto produto3 = new Produto("Leite", 8, 100);
        
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        //Tamanho da lista
        System.out.println("Tamanho da lista = " + listaProdutos.size());

        //Primeiro produto da lista
        System.out.println("Primeiro produto da lista = " + listaProdutos.get(0));
    
        //Lista de produtos
        System.out.println("Lista de produtos: " + listaProdutos);

        ProdutoPerecivel estragado = new ProdutoPerecivel("Queijo", 6.99, 50, 2010);
        System.out.println("Valores do Produto perecível: " + estragado.toString());
    }
}
