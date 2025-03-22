package TerceiroCurso.ExercicioFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        double acumuladoCarrinho = 0;

        Usuario user = new Usuario();
        ArrayList<Produto> carrinho = new ArrayList<>();

        System.out.print("Digite o limite do cartão: R$");
        double saldo = entrada.nextDouble();
        entrada.nextLine();  // Clear the buffer
        user.setSaldo(saldo);

        while(opcao == 0){
            Produto produto = new Produto();

            System.out.print("\nDigite a descrição da compra: ");
            String nomeProduto = entrada.nextLine();
            produto.setDescricao(nomeProduto);

            System.out.print("Digite o valor da compra: R$");
            double preco = entrada.nextDouble();
            produto.setPreco(preco);

            if(preco > user.getSaldo()){
                System.out.println("## Saldo insuficiente! ##");
            } else {
                if(acumuladoCarrinho + preco <= user.getSaldo()){
                    carrinho.add(produto);
                    acumuladoCarrinho = acumuladoCarrinho + preco;
                    System.out.println("Compra realizada!");
                } else {
                    System.out.println("## Estourou o limite ##");
                }
            }
            System.out.println ("Deseja continuar? 0-CONTINUAR");
            opcao = entrada.nextInt();
            entrada.nextLine();  // Clear the buffer
        }

        System.out.println("\n---------------------");
        System.out.println("Itens do carrinho: ");
        Collections.sort(carrinho);
        for(int i=0; i < carrinho.size(); i++){
            System.out.println(carrinho.get(i));
        }
        System.out.println("\nAté a próxima!");
    }
}
