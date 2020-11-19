package Questao_6;

public class SalarioMinimo {
    private short valor;

    public void setValor(short novoValor) {
        valor = novoValor;
    }

    public float quantidadeSalarios(short salario) {
        return salario / (float) valor;
    }
}
