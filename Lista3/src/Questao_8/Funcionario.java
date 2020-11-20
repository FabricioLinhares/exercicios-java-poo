package Questao_8;

public class Funcionario {
    private float salario;
    private byte tempoEmpresa;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void passarAno() {
        tempoEmpresa++;
        float porcentagemAumento=0.015f;
        short taxaTempo=1;

        for (byte i=0; i < tempoEmpresa-1; i++)
            taxaTempo *= 2;
        porcentagemAumento *= taxaTempo;

        aplicarAumento(porcentagemAumento);
    }

    private void aplicarAumento(float porcentagem) {
        salario *= (1+porcentagem);
    }
}
