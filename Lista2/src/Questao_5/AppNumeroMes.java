package Questao_5;

import java.util.Scanner;

public class AppNumeroMes {
    public static void main(String[] args) {
        Ano ano = new Ano();

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite o nome do mês: ");
        byte numeroMes = ano.getMes(dado.nextLine().toLowerCase());

        if (numeroMes == 0)
            System.out.println("NOME INVÁLIDO!");
        else
            System.out.println("Número do mês: " + numeroMes);

        dado.close();
    }
}
