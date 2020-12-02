package Questao4;

public class ContaPoupanca extends Conta {
    @Override
    public void atualizar(float taxa) {
        saldo *= 1 + taxa*3;
    }
}
