package Questao4;

public class Conta {
    protected float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        if (valor > 0)
            saldo += valor;
    }

    public void sacar(float valor) {
        if (valor <= saldo)
            saldo -= valor;
    }

    public void atualizar(float taxa) {
        saldo *= 1 + taxa;
    }
}
