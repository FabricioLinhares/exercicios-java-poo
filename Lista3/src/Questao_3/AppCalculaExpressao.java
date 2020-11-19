package Questao_3;

import java.util.Scanner;

public class AppCalculaExpressao {
    public static void main(String[] args) {
        Expressao expressao = new Expressao();

        Scanner dado = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");

        expressao.setN(dado.nextInt());

        System.out.print("Resultado: " + expressao.resultado());

        dado.close();
    }
}
