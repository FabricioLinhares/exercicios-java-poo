package Questao_2;

import java.util.Scanner;

public class AppOrdemInversa {
    public static void main(String[] args) {
        Sequencia valores = new Sequencia();

        System.out.print("Digite os valores: ");
        Scanner dado = new Scanner(System.in);
        valores.setNumero1(dado.nextInt());
        valores.setNumero2(dado.nextInt());
        valores.setNumero3(dado.nextInt());

        System.out.print(valores.getNumero3() + " ");
        System.out.print(valores.getNumero2() + " ");
        System.out.print(valores.getNumero1());
    }
}