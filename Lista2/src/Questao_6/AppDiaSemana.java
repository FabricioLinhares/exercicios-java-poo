package Questao_6;

import java.util.Scanner;

public class AppDiaSemana {
    public static void main(String[] args) {
        Semana semana = new Semana();

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite o número do dia: ");
        byte numeroSemana = dado.nextByte();

        System.out.println("Dia da semana: " + semana.getDia(numeroSemana));

        dado.close();
    }
}
