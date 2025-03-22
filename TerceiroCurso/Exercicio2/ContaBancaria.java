package TerceiroCurso.Exercicio2;

public class ContaBancaria {
    private int conta;
    private double saldo;

    public ContaBancaria(int conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }

    public int getConta(){
        return this.conta;
    }
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString(){
        return "Conta: " + this.conta + " , Saldo = R$" + this.saldo;
    }
}
