package Questao_6;

public class AppPotencia {
    public static void main(String[] args) {
        mostrarPotencia((byte) 3, (byte) 9);
    }

    public static void mostrarPotencia(byte base, byte potenciaMax) {
        for (byte i=0; i <= potenciaMax; i++)
            System.out.print((int)Math.pow(base, i) + " ");
    }
}
