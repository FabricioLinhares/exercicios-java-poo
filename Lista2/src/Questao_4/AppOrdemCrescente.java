package Questao_4;

import java.util.Scanner;

public class AppOrdemCrescente {
    public static void main(String[] args) {
        Ordenacao valores = new Ordenacao();

        Scanner dado = new Scanner(System.in);

        int[] numeros = new int[3];
        System.out.print("Digite o valor 1: ");
        numeros[0] = dado.nextInt();
        System.out.print("Digite o valor 2: ");
        numeros[1] = dado.nextInt();
        System.out.print("Digite o valor 3: ");
        numeros[2] = dado.nextInt();
        valores.setOrdenado(numeros);

        System.out.print("Valores ordenados: ");
        System.out.print(valores.getOrdenado((byte)0) + " ");
        System.out.print(valores.getOrdenado((byte)1) + " ");
        System.out.print(valores.getOrdenado((byte)2) + " ");
    }
}
