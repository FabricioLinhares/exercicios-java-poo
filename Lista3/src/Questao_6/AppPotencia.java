package Questao_6;

public class AppPotencia {
    public static void main(String[] args) {
        for (byte i=0; i <= 9; i++)
            System.out.print(potencia((byte)3, i) + " ");
    }

    public static int potencia(byte base, byte exp) {
        int resultado=1;
        for (byte i=0; i < exp; i++)
            resultado *= base;

        return resultado;
    }
}
