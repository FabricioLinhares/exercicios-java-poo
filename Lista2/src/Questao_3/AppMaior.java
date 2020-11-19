package Questao_3;

import java.util.Scanner;

public class AppMaior {
    public static void main(String[] args) {
        Valores numeros = new Valores();

        Scanner dado = new Scanner(System.in);
        System.out.print("Digite o número 1: ");
        numeros.setNum1(dado.nextInt());
        System.out.print("Digite o número 2: ");
        numeros.setNum2(dado.nextInt());

        System.out.println("Maior: " + numeros.maior());
    }
}
