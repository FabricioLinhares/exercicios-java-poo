package Questao1;

public class Numeros {
    private final int[] valores;
    private final byte quantidadePar;
    private final byte quantidadeImpar;

    public Numeros(int[] valores) {
        byte impares=0, pares=0;

        for (byte i=0; i < valores.length; i++)
            if (valores[i] % 2 == 0)
                pares++;
            else
                impares++;

        this.valores = valores;
        this.quantidadeImpar = impares;
        this.quantidadePar = pares;
    }

    public int[] getPares() {
        int[] pares = new int[quantidadePar];
        byte index=0;

        for (byte i=0; i < valores.length; i++)
            if (valores[i] % 2 == 0)
                pares[index++] = valores[i];

        return pares;
    }

    public int[] getImpares() {
        int[] impares = new int[quantidadeImpar];
        byte index=0;

        for (byte i=0; i < valores.length; i++)
            if (valores[i] % 2 != 0)
                impares[index++] = valores[i];

        return impares;
    }
}
