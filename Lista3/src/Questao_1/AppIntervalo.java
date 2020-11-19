package Questao_1;

import java.util.Scanner;

public class AppIntervalo {
    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo();

        Scanner dado = new Scanner(System.in);
        System.out.print("Digite os dois valores: ");

        int[] limite = {dado.nextInt(), dado.nextInt()};
        intervalo.setLimite(limite);

        System.out.print("Soma do intervalo: " + intervalo.soma());

        dado.close();
    }
}
