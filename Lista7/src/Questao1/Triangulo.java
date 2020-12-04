package Questao1;

public class Triangulo extends Figura {
    private final double[] lados = new double[3];

    public Triangulo(double lado1, double lado2, double lado3) {
        lados[0] = lado1;
        lados[1] = lado2;
        lados[2] = lado3;
    }

    @Override
    public double calcularArea() {
        return 1;
    }
}
