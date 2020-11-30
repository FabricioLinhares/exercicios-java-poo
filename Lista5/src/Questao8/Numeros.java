package Questao8;

public class Numeros {
    private int[] valores;

    public Numeros(int[] valores) {
        this.valores = valores;
    }

    public int[][] getPrimos() {
        int[][] aux;
        int[][] primos = new int[valores.length][2];
        byte index = 0;

        for (byte i=0; i < valores.length; i++) {
            if (isPrimo(valores[i])) {
                primos[index][0] = i;
                primos[index++][1] = valores[i];
            }
        }

        aux = new int[index][2];

        for (byte i=0; i < index; i++)
            aux[i] = primos[i];

        primos = aux;

        return primos;
    }

    private boolean isPrimo(int num) {
        if (num <= 0)
            return false;

        for (byte i=2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
}
