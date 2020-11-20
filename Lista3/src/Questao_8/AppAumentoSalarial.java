package Questao_8;

public class AppAumentoSalarial {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(1000);

        System.out.println("Salário em 2005: " + funcionario.getSalario());
        for (int i=2006; i <= 2016; i++) {
            funcionario.passarAno();
            System.out.println("Salário em " + i + ": " + funcionario.getSalario());
        }
    }
}
