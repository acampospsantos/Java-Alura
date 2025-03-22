package TerceiroCurso.Exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(20);
        listaInteiros.add(10);
        listaInteiros.add(100);
        listaInteiros.add(50);
        listaInteiros.add(0);
        Collections.sort(listaInteiros);
        System.out.println("Lista ordenada = " + listaInteiros);

        List<Titulo> listaTitulos = new ArrayList<>();
        Titulo titulo1 = new Titulo("Anderson");
        Titulo titulo2 = new Titulo("Gio");
        Titulo titulo3 = new Titulo("Gê");
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        Collections.sort(listaTitulos);
        System.out.println("Lista de Títulos ordenada = " + listaTitulos);
    }
}
