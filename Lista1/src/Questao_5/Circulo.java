package Questao_5;

public class Circulo {
    private float raio;
    private static float PI=(float)3.14;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public float area() {
        return PI * raio * raio;
    }
}
