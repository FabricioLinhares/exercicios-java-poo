package Questao_2;

public class Intervalo {
    private final byte[] limite = new byte[2];

    public void setLimite(byte[] novoLimite) {
        boolean ehValoresPositivos=true;
        byte index=0;
        do {
            if (novoLimite[index++] < 0)
                ehValoresPositivos = false;
        } while (index < (byte)2 && ehValoresPositivos);

        if (ehValoresPositivos) {
            if (novoLimite[0] < novoLimite[1]) {
                limite[0] = novoLimite[0];
                limite[1] = novoLimite[1];
            }
            else {
                limite[1] = novoLimite[0];
                limite[0] = novoLimite[1];
            }
        }

    }

    public byte[] pares() {
        byte quantidade, contador, index=0;
        if (limite[0]%2 == 0 && limite[1]%2 == 0)
            quantidade = (byte) (((limite[0] + limite[1]) / 2) - 1);
        if (limite[0]%2 == 1 && limite[1]%2 == 1)
            quantidade = (byte) ((limite[0] + limite[1]) / 2);
        else
            quantidade = (byte) ((limite[0] + limite[1] - 1) / 2);

        byte[] valoresPares = new byte[quantidade];

        contador = (byte)(limite[0]+1);
        while (index < quantidade) {
            if (contador%2 == 0)
                valoresPares[index++] = contador;
            contador++;
        }

        return valoresPares;
    }
}
