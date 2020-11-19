package Questao_4;

import java.util.Arrays;

public class Ordenacao {
    private int[] ordenado = new int[3];

    public int getOrdenado(byte index) {
        return ordenado[index];
    }

    public void setOrdenado(int[] valores) {
        this.ordenado = valores;

        Arrays.sort(this.ordenado);
    }
}
