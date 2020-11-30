package Questao10;

public class Matriz {
    private final int[][] matriz;

    public Matriz(byte linhas, byte colunas) {
        this.matriz = new int[linhas][colunas];
    }

    public void setElemento(byte linha, byte coluna, int elemento) {
        this.matriz[linha][coluna] = elemento;
    }

    public byte[][] getPos(int elemento) {
        byte aux[][];
        byte pos[][] = new byte[matriz.length * matriz[0].length][2];
        byte index=0;

        for (byte i=0; i < matriz.length; i++) {
            for (byte j = 0; j < matriz[i].length; j++) {
                if (elemento == matriz[i][j]) {
                    pos[index][0] = i;
                    pos[index][1] = j;
                    index++;
                }
            }
        }

        aux = new byte[index][2];

        for (byte i=0; i < index; i++) {
            aux[i][0] = pos[i][0];
            aux[i][1] = pos[i][1];
        }

        pos = aux;

        return pos;
    }
}
