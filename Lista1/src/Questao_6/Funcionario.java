package Questao_6;

public class Funcionario {
    private short salario;

    public short getSalario() {
        return salario;
    }

    public void setSalario(short salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
}
