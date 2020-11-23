package Questao5;

public class AppConta {
    public static void main(String[] args) {
        Conta novaConta = new Conta("João", 2409, 2345f, 468.5f);

        System.out.println("Cliente: " + novaConta.getNomeCliente() + " | Saldo: " + novaConta.getSaldo());

        novaConta.depositar(500);
        boolean podeSacar = novaConta.sacar(300);

        if (podeSacar)
            System.out.println("Saldo após saque: " + novaConta.getSaldo());
    }
}
