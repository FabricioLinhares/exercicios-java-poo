package Questao_4;

import java.util.Scanner;

public class AppCalculaMedia {
    public static void main(String[] args) {
        Sequencia valores = new Sequencia();

        System.out.print("Digite os valores: ");
        Scanner dado = new Scanner(System.in);
        valores.setNumero1(dado.nextInt());
        valores.setNumero2(dado.nextInt());
        valores.setNumero3(dado.nextInt());

        System.out.println("Media dos valores: " + valores.media());
    }
}
