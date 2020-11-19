package Questao_1;

public class Galao {
    private byte valor;
    private static final float capacidade=(float)3.7854;

    public float getCapacidade() {
        return capacidade;
    }

    public byte getValor() {
        return valor;
    }

    public void setValor(byte valor) {
        this.valor = valor;
    }

    public float litros() {
        return valor * capacidade;
    }
}
