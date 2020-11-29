package Questao2;

public class Numeros {
    private int[] valores;

    public void setValores(int[] valores) {
        this.valores = valores;
    }

    public int getMaior() {
        int maior = valores[0];

        for (byte i=1; i < valores.length; i++)
            if (valores[i] > maior)
                maior = valores[i];

        return maior;
    }

    public int getMenor() {
        int menor = valores[0];

        for (byte i=1; i < valores.length; i++)
            if (valores[i] < menor)
                menor = valores[i];

        return menor;
    }
}
