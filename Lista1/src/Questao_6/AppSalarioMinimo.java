package Questao_6;

import java.util.Scanner;

public class AppSalarioMinimo {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        SalarioMinimo salarioMinimo = new SalarioMinimo();

        System.out.print("Salário Minimo: ");
        Scanner dado = new Scanner(System.in);
        salarioMinimo.setValor(dado.nextShort());
        System.out.print("Salário Funcionário: ");
        funcionario.setSalario(dado.nextShort());

        float quantidade =  salarioMinimo.quantidadeSalarios(funcionario.getSalario());
        System.out.println("Quantidade de salarios minimos do funcionário: " + quantidade);
    }
}
