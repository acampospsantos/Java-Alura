package PrimeiroCurso;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100)+1;
        int numeroJogador = 0;
        int tentativas = 1;

        System.out.println("----- JOGO ADIVINHAÇÃO -----");
        while(tentativas < 6){
            System.out.println("Digite sua " + tentativas + "º tentativa: ");
            numeroJogador = entrada.nextInt();
            if(numeroJogador == numeroAleatorio){
                System.out.println("Jogador ganhou!!");
                System.out.println("--- Ganhou na " + tentativas + "º tentativa! ---");
                break;
            } else {
                System.out.println("Jogador errou o número! - " + tentativas + "º tentativa");
                if(numeroAleatorio > numeroJogador){
                    System.out.println("--- O número digitado é MENOR que o número aleatório! ---");
                } else if (numeroAleatorio < numeroJogador){
                    System.out.println("--- O número digitado é MAIOR que o número aleatório! ---");
                }
                tentativas = tentativas + 1;
            }
        }
        if (tentativas == 6){
            System.out.println("Jogador PERDEU!");
            System.out.println("Número aleatório selecionado: " + numeroAleatorio);
        }
    }
    
}
