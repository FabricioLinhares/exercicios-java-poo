package Questao9;

public class Conjuntos {
    private int[] conjunto1;
    private int[] conjunto2;

    public Conjuntos(int[] conjunto1, int[] conjunto2) {
        this.conjunto1 = conjunto1;
        this.conjunto2 = conjunto2;
    }

    private boolean isInConjunto(int[] conjunto, int elemento) {
        for (byte i=0; i < conjunto.length; i++)
            if (elemento == conjunto[i])
                return true;

        return false;
    }

    private boolean addElemento(int[] conjunto, int elemento, int last) {
        if (!isInConjunto(conjunto, elemento)) {
            conjunto[last] = elemento;
            return true;
        }
        return false;
    }

    public int[] getUniao() {
        int[] aux;
        int[] uniao = new int[conjunto1.length + conjunto2.length];
        byte index=0;

        for (byte i=0; i < conjunto1.length; i++) {
            boolean adicionou = addElemento(uniao, conjunto1[i], index);

            if (adicionou)
                index++;
        }

        for (byte i=0; i < conjunto2.length; i++) {
            boolean adicionou = addElemento(uniao, conjunto2[i], index);

            if (adicionou)
                index++;
        }

        aux = new int[index];

        for (byte i=0; i < index; i++)
            aux[i] = uniao[i];

        uniao = aux;

        return uniao;
    }

    public int[] getDiferenca() {
        int[] aux;
        int[] diferenca = new int[conjunto1.length];
        byte index=0;

        for (byte i=0; i < conjunto1.length; i++) {
            if (!isInConjunto(conjunto2, conjunto1[i])) {
                boolean adicionou = addElemento(diferenca, conjunto1[i], index);

                if (adicionou)
                    index++;
            }
        }

        aux = new int[index];

        for (byte i=0; i < index; i++)
            aux[i] = diferenca[i];

        diferenca = aux;

        return diferenca;
    }

    public int[] getInterseccao() {
        int[] aux;
        int[] interseccao = new int[conjunto1.length];
        byte index=0;

        for (byte i=0; i < conjunto1.length; i++) {
            if (isInConjunto(conjunto2, conjunto1[i])) {
                boolean adicionou = addElemento(interseccao, conjunto1[i], index);

                if (adicionou)
                    index++;
            }
        }

        aux = new int[index];

        for (byte i=0; i < index; i++)
            aux[i] = interseccao[i];

        interseccao = aux;

        return interseccao;
    }
}
