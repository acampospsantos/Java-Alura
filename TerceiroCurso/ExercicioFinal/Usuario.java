package TerceiroCurso.ExercicioFinal;

import java.util.ArrayList;

public class Usuario {
    private double limiteCartao;
    private double saldo;

    //Métodos Acessores e Modificadores
    public void setLimiteCartao(double limiteCartao){
        this.limiteCartao = limiteCartao;
    }
    public double getLimiteCartao(){
        return this.limiteCartao;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
