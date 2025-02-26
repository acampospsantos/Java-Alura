package PrimeiroCurso;

import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //1º EXERCÍCIO
        int numero;
        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        if(numero > 0){
            System.out.println(numero + " é positivo!!");
        } else if (numero < 0){
            System.out.println(numero + " é negativo!!");
        } else {
            System.out.println(numero + " é igual a 0!!");
        }

        
        //2º EXERCÍCIO
        int numero1;
        int numero2;
        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        if (numero1 > numero){
            System.out.println("Os números são diferentes!");
            System.out.println("O primeiro número(" + numero1 + ") é MAIOR que o segundo número(" + numero2 + ")");            
        } else if (numero1 < numero2){
            System.out.println("Os números são diferentes!");
            System.out.println("O primeiro número(" + numero1 + ") é MENOR que o segundo número(" + numero2 + ")");
        } else { //numero1 == numero2
            System.out.println("Os números são iguais!!");
        }


        //3º EXERCÍCIO
        System.out.println("MENU");
        System.out.println("1 - Calcular área quadrado");
        System.out.println("2 - Calcular área do círculo");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                double ladoQuadrado;
                System.out.print("Digite o valor do lado do quadrado: ");
                ladoQuadrado = entrada.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("Área do quadrado = " + areaQuadrado);                
                break;

            case 2:
                double raio;
                System.out.println("Digite o valor do raio: ");
                raio = entrada.nextDouble();
                double areaCirculo = 3.14 * (raio * raio);
                System.out.println("Área do círculo = " + areaCirculo);
                break;
        
            default:
                System.out.println("OPÇÃO INVÁLIDA!!");
        }


        //4º EXERCÍCIO
        int numeroTabuada;
        System.out.print("Digite um número: ");
        numeroTabuada = entrada.nextInt();
        for (int i=1; i <= 10; i++){
            int calculo = numeroTabuada * i;
            System.out.println(numero + "x " + i + " = " + calculo);
        }


        //5º EXERCÍCIO
        int numeroParImpar;
        System.out.print("Digite um número: ");
        numeroParImpar = entrada.nextInt();
        if (numeroParImpar % 2 == 0){
            System.out.println(numeroParImpar + " É PAR!");
        } else {
            System.out.println(numeroParImpar + " É ÍMPAR!");
        }


        //6º EXERCÍCIO
        int numeroFatorial;
        int fatorial=1;
        System.out.print("Digite um número para calcular o fatorial: ");
        numeroFatorial = entrada.nextInt();
        for (int i=1; i < numeroFatorial; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + numeroFatorial + " = " + fatorial);
    }
}
