package Questao10;

import java.util.Scanner;

public class AppMatriz {
    public static void main(String[] args) {
        Matriz matriz = new Matriz((byte) 5, (byte) 8);
        Scanner dado = new Scanner(System.in);

        for (byte i=0; i < 5; i++) {
            System.out.print("Linha " + i + ": ");
            for (byte j = 0; j < 8; j++)
                matriz.setElemento(i, j, dado.nextInt());
        }

        boolean querContinuar;

        do {
            System.out.print("\nEscolha o número que deseja procurar: ");

            byte[][] pos = matriz.getPos(dado.nextInt());
            if (pos.length > 0) {
                System.out.print("Posições do elemento: ");
                for (byte i=0; i < pos.length; i++)
                    System.out.print("["+ pos[i][0] +"]" + "[" + pos[i][1] + "]" + " ");
                System.out.println();
            } else
                System.out.println("Esse elemento não se encontra na matriz!");

            System.out.print("Quer continuar? (true/false) ");

            querContinuar = dado.nextBoolean();
        } while (querContinuar);
    }
}
