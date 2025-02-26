package PrimeiroCurso;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media=0;
        double nota=0;

        double mediaWhile = 0;
        double notaWhile = 0;
        int contador = 0;

        for (int i=0; i < 3; i=i+1){
            System.out.print("Diga sua avaliação para o filme: ");
            nota = entrada.nextInt();
            media = media + nota;
        }
        System.out.println("Média das notas = " + media/3);

        System.out.println("");

        while(notaWhile != -1){
            System.out.print("Diga sua avaliação para o filme: ");
            notaWhile = entrada.nextDouble();
            if(notaWhile > -1){
                mediaWhile = mediaWhile + notaWhile;
                contador = contador+1;
            }
        }
        System.out.println("Média das avaliações = " + mediaWhile/contador);
    }
}
