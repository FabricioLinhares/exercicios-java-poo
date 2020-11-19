package Questao_7;

public class Numero {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean ehPrimo() {
        for (int i=2; i < valor; i++) {
            if (valor % i == 0)
                return false;
        }

        return true;
    }
}
