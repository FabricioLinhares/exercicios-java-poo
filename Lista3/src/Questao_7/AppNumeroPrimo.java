package Questao_7;

import java.util.Scanner;

public class AppNumeroPrimo {
    public static void main(String[] args) {
        Numero valor = new Numero();

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        valor.setValor(dado.nextInt());
        if (valor.ehPrimo())
            System.out.println("O número é primo");
        else
            System.out.println("O número NÃO é primo");
    }
}
