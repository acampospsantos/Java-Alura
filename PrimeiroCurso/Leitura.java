package PrimeiroCurso;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = entrada.nextLine();

        System.out.print("Digite o ano de lançamento: ");
        int anoDeLancamento = entrada.nextInt();

        System.out.print("Qual a sua avaliação para o filme: ");
        double avaliacao = entrada.nextDouble();

        System.out.println("\nTítulo: " + filme);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Avaliação do filme: " + avaliacao);
    }
}