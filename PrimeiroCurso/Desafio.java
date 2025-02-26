package PrimeiroCurso;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "Anderson";
        String tipoConta = "Corrente";
        double saldo = 2000;
        int escolha;

        System.out.println("********************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nnome: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$ " + saldo);
        System.out.println("********************************************");
        
        while(true){
            System.out.println("\nOperações");
            System.out.println("\n1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - SAIR");

            System.out.print("Digite a opção desejada: ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nSaldo = R$" + saldo);
                    break;

                case 2:
                    System.out.print("Digite quanto vai receber: R$ ");
                    double receber = entrada.nextDouble();
                    saldo = saldo + receber;
                    System.out.println("Valor depositado!");
                    break;

                case 3:
                    System.out.print("Digite quanto vai transferir: R$ ");
                    double transferir = entrada.nextDouble();
                    if(transferir <= saldo){
                        saldo = saldo - transferir;
                        System.out.println("Valor transferido!");
                    } else {
                        System.out.println("### Valor da transferência é maior que o saldo! ###");
                    }
                    break;

                case 4:
                    System.out.println("SAINDO DO PROGRAMA...");
                    return;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!!");
            }
        }
    }
}
