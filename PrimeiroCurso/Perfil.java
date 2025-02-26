package PrimeiroCurso;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick ");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = false;
        double notaFime = 8.1;

        double media = (9.8 + 6.5 + 7.7)/3;
        System.out.println("Nota do filme = " + media);
        
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);
        System.out.println("");

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}
