package Questao3;

public class Matriz {
    private final int[][] matriz;

    public Matriz(byte linhas, byte colunas) {
        this.matriz = new int[linhas][colunas];
    }

    public void setLinha(byte index, int[] linha) {
        this.matriz[index] = linha;
    }

    private int getMaior() {
        int maior = matriz[0][0];

        for (byte i=0; i < matriz.length; i++)
            for (byte j=0; j < matriz[i].length; j++)
                if (matriz[i][j] > maior)
                    maior = matriz[i][j];

        return maior;
    }

    public int[][] getMatrizR() {
        int[][] matrizR = matriz.clone();
        int maior = getMaior();

        for (byte i=0; i < matriz.length; i++)
            for (byte j=0; j < matriz[i].length; j++)
                matrizR[i][j] = matriz[i][j] * maior;

        return matriz;
    }
}
