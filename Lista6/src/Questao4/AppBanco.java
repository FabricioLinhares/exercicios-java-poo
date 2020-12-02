package Questao4;

public class AppBanco {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        corrente.depositar(500);
        poupanca.depositar(200);

        corrente.atualizar(0.2f);
        poupanca.atualizar(0.2f);

        corrente.sacar(70);
        poupanca.sacar(95);

        System.out.println("Saldo Poupança: " + poupanca.getSaldo());
        System.out.println("Saldo Corrente: " + corrente.getSaldo());
    }
}
