package Questao_10;

public class Quadrado {
    private double lado;

    public void setLado(double valor) {
        lado = valor;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return lado*lado*lado*lado;
    }

    public double calcularPerimetro() {
        return lado*4;
    }
}
