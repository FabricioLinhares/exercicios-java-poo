package Questao_7;

import java.util.Scanner;

public class AppEmprestimo {
    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite o seu salário bruto: ");
        float salario = dado.nextFloat();
        System.out.print("Digite o total de descontos: ");
        float descontos = dado.nextFloat();
        emprestimo.setLimite(salario, descontos);

        System.out.print("Digite o emprestimo pretendido: ");
        emprestimo.setValor(dado.nextFloat());

        if (emprestimo.isValid())
            System.out.println("EMPRESTIMO APROVADO!");
        else
            System.out.println("EMPRESTIMO NÃO APROVADO!");

        dado.close();
    }
}
