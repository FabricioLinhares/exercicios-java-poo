package Questao_1;

public class Intervalo {
    private final int[] limite = new int[2];

    public int[] getLimite() {
        return limite;
    }

    public void setLimite(int[] novoLimite) {
        boolean ehValoresPositivos=true;
        byte index=0;
        do {
            if (novoLimite[index++] < 0)
                ehValoresPositivos = false;
        } while (index < (byte)2 && ehValoresPositivos);

        if (ehValoresPositivos)
            for (byte i=0; i < 2; i++)
                limite[i] = novoLimite[i];
    }

    public int soma() {
        int soma=0, numeroAtual;
        if (limite[0] < limite[1]) {
            numeroAtual = (limite[0]+1);
            while (numeroAtual < limite[1])
                soma += numeroAtual++;
        }
        else {
            numeroAtual = (limite[1]+1);
            while (numeroAtual < limite[0])
                soma += numeroAtual++;
        }

        return soma;
    }
}
