package PrimeiroCurso;

import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Programa: Conversão de Graus Celsius para Graus Farenheit
        double temperaturaCelsius;
        System.out.print("Digite a temperatura em Celsius: ");
        temperaturaCelsius = entrada.nextDouble();
        double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em celsius = " + (int)temperaturaCelsius + "ºC , Temperatura em Farenheit = " + (int)temperaturaFarenheit + "ºF");
        //System.out.println(String.format("\nTemperatura Celsius = %f ºC, Temperatura Farenheit = %fºF", temperaturaCelsius, temperaturaFarenheit));


        System.out.println("--- 1º EXERCÍCIO ---");
        System.out.print("Digite a nota 1 e a nota 2: ");
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double media;
        media = (nota1 + nota2)/2;
        System.out.println("A média entre " + nota1 + " e " + nota2 + " = " + media);


        System.out.println("--- 2º EXERCÍCIO ---");
        double gols = 10;
        int goles = 20;
        int soma = (int)gols + goles;
        System.out.println("A soma das variáveis = " + soma);


        System.out.println("--- 3º EXERCÍCIO ---");
        char caractere = '!';
        String palavra = "Bom dia";
        System.out.println(palavra + caractere);


        System.out.println("--- 4º EXERCÍCIO ---");
        double precoProduto;
        System.out.print("Digite o preço do produto: R$");
        precoProduto = entrada.nextDouble();
        int quantidade;
        System.out.println("Digite a quantidade = ");
        quantidade = entrada.nextInt();
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total = R$" + valorTotal);


        System.out.println("--- 5º EXERCÍCIO ---");
        double valorEmDolares = 5;
        double conversaoReal = 4.94 * valorEmDolares;
        System.out.println("Valor após conversão = R$" + conversaoReal);


        System.out.println("--- 6º EXERCÍCIO ---");
        double precoOriginal = 10;
        double percentualDesconto = 0.1;
        double aposDesconto = precoOriginal - precoOriginal*percentualDesconto;
        System.out.println("Valor após desconto = R$" + aposDesconto);
    }
}