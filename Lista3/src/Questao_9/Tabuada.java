package Questao_9;

public class Tabuada {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirSoma() {
        for (byte i=0; i <= 10; i++)
            System.out.println(numero + " + " + i + " = " + (numero+i));
    }
}
