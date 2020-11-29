package Questao2;

import java.util.Scanner;

public class AppNumeros {
    public static void main(String[] args) {
        Numeros num = new Numeros();
        int[] valores;
        Scanner dado = new Scanner(System.in);

        valores = new int[10];
        for (byte i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            valores[i] = dado.nextInt();
        }
        num.setValores(valores);

        System.out.println("\nMaior valor: " + num.getMaior());
        System.out.println("Menor valor: " + num.getMenor());
    }
}
