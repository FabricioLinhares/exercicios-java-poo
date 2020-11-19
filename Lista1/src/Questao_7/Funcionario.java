package Questao_7;

public class Funcionario {
    private short salario;

    public short getSalario() {
        return salario;
    }

    public void setSalario(short salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public short aumentarSalario(byte porcentagemAumento) {
        final short valorAumento;

        valorAumento = (short) (getSalario() * porcentagemAumento / 100);
        setSalario((short) (getSalario() + valorAumento));

        return valorAumento;
    }
}
