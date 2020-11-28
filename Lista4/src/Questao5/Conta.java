package Questao5;

public class Conta {
    private String nomeCliente;
    private long numero;
    private float saldo;
    private float limite;

    private static final int salarioMinimo=940;

    public Conta(String nomeCliente, long numero, float saldo, float limite) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite < salarioMinimo ? limite : salarioMinimo;
    }



    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        if (valor > 0)
            saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor <= saldo && valor <= limite) {
            saldo -= valor;
            return true;
        }
        else
            return false;

    }


}
