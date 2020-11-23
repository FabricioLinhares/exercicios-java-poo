package Questao3;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "Masculino", "Finanças", 2300f);

        funcionario1.bonificar(0.4f); // bonificação de 40%

        System.out.println(funcionario1.getNome() + "ganha R$" + funcionario1.getSalario() + " mensalmente.");
        System.out.println(funcionario1.getNome() + "ganha R$" + funcionario1.ganhoAnual() + " anualmente.");
    }
}
