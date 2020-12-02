package Questao4;

public class ContaCorrente extends Conta {
    @Override
    public void atualizar(float taxa) {
        saldo *= 1 + taxa*2;
    }

    @Override
    public void depositar(float valor) {
        if (valor - 0.1 > 0)
            saldo += valor - 0.1;
    }
}
