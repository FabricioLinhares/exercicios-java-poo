package Questao1;

import java.util.Scanner;

public class AppMostrarNumeros {
    public static void main(String[] args) {
        Numeros num;
        int[] pares, impares, valores;
        Scanner dado = new Scanner(System.in);

        valores = new int[10];
        for (byte i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            valores[i] = dado.nextInt();
        }
        num = new Numeros(valores);

        pares = num.getPares();
        System.out.print("\nValores Pares: ");
        for (byte i = 0; i < pares.length; i++)
            System.out.print(pares[i] + " ");

        impares = num.getImpares();
        System.out.print("\nValores Impares: ");
        for (byte i = 0; i < impares.length; i++)
            System.out.print(impares[i] + " ");

        System.out.println("\nQuantidade de pares: " + pares.length);
        System.out.println("Quantidade de impares: " + impares.length);
    }
}
