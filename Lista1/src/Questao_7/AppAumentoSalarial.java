package Questao_7;

import java.util.Scanner;

public class AppAumentoSalarial {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o seu salário: ");
        Scanner dado = new Scanner(System.in);
        funcionario.setSalario(dado.nextShort());

        System.out.println("Salário atual: R$" + funcionario.getSalario());
        short aumentoSalarial = funcionario.aumentarSalario((byte)25);
        System.out.println("Aumento: R$" + aumentoSalarial);
        System.out.println("Novo salário: R$" + funcionario.getSalario());
    }
}
