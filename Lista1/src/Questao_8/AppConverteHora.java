package Questao_8;

import java.util.Scanner;

public class AppConverteHora {
    public static void main(String[] args) {
        Tempo horario = new Tempo();

        System.out.print("Digite a hora e os minutos: ");
        Scanner dado = new Scanner(System.in);
        horario.setHoras(dado.nextByte());
        horario.setMinutos(dado.nextByte());

        System.out.println("Horas em minutos: " + horario.horasParaMinutos());
        System.out.println("Total de minutos: " + horario.minutosTotal());
        System.out.println("Total de segundos: " + horario.segundosTotal());
    }
}
