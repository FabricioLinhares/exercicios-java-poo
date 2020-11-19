package Questao_3;

public class Expressao {
    private int n;

    public void setN(int n) {
        if (n > 0)
            this.n = n;
    }

    public float resultado() {
        float soma=0;
        for (int i=1; i <= n; i++)
            soma += 1.0/i;
        return soma;
    }
}
