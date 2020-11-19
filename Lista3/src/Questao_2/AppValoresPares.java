package Questao_2;

public class AppValoresPares {
    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo();

        byte[] limite = {0, 100};
        intervalo.setLimite(limite);
        byte[] pares = intervalo.pares();

        System.out.print("Valores pares:");
        for (byte i=0; i < pares.length; i++)
            System.out.print(" " + pares[i]);
    }
}
