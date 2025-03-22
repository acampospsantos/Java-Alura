package TerceiroCurso.Exercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, 1000);
        ContaBancaria conta2 = new ContaBancaria(2, 10000);
        ContaBancaria conta3 = new ContaBancaria(3, 200);
        ContaBancaria conta4 = new ContaBancaria(4, 100);
        ContaBancaria conta5 = new ContaBancaria(5, 2000);

        ArrayList<ContaBancaria> lista = new ArrayList<>();
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        lista.add(conta4);
        lista.add(conta5);

        ContaBancaria contaMaisRica = lista.get(0);
        for(int i=0; i<lista.size(); i++){
            if(contaMaisRica.getSaldo() < lista.get(i).getSaldo()){
                contaMaisRica = lista.get(i);
            }
        }
        System.out.println("Conta mais rica: " + contaMaisRica);
    }
}
