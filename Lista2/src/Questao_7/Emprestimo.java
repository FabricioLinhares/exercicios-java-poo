package Questao_7;

public class Emprestimo {
    private static final float TAXA_LIMITE=(float)0.3;
    private float limite;
    private float valor;

    public void setLimite(float salarioBruto, float descontos) {
        limite = (salarioBruto - descontos) * TAXA_LIMITE;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isValid() {
        return valor < limite;
    }
}
