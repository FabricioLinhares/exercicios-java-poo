package Questao_8;

public class Triangulo {
    private int[] lados = new int[3];

    public int getLado(byte index) {
        return lados[index];
    }

    public void setLado(byte index, int valor) {
        this.lados[index] = valor;
    }

    private boolean isTriangulo() {
        return (lados[0] < lados[1] + lados[2] && lados[1] < lados[0] + lados[2] && lados[2] < lados[0] + lados[1]);
    }

    public String tipo() {
        if (isTriangulo())
            if (lados[0] == lados[1] && lados[1] == lados[2])
                return "equilátero";
            else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2])
                return "isósceles";
            else
                return "escaleno";
        else
            return "NÃO É TRIANGULO";
    }
}
