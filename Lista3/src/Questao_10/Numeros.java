package Questao_10;

public class Numeros {
    private int[] valores;

    public void setValores(int[] valores) {
        this.valores = valores;
    }

    public int maior() {
        int maior = valores[0];
        byte tamanho = (byte)valores.length;
        for (byte i=1; i < tamanho; i++)
            if (valores[i] > maior)
                maior = valores[i];
        return maior;
    }

    public long soma() {
        long resultado=0;
        byte tamanho = (byte)valores.length;
        for (byte i=0; i < tamanho; i++)
            resultado += valores[i];
        return resultado;
    }

    public float media() {
        return (float)(soma()*1.0/valores.length);
    }
}
