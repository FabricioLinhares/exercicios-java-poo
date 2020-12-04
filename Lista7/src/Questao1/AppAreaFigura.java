package Questao1;

import java.util.Scanner;

public class AppAreaFigura {
    public static void main(String[] args) {
        Figura figura;
        Scanner dado = new Scanner(System.in);

        System.out.print("[0] Quadrado\n[1] Círculo\n[2] Triângulo\nEscolha um número para a figura: ");
        byte resposta = dado.nextByte();

        if (resposta >= 0 && resposta <= 2) {
            if (resposta == 0) {
                System.out.print("Digite o lado do quadrado: ");
                figura = new Quadrado(dado.nextDouble());
            } else if (resposta == 1) {
                System.out.print("Digite o raio do círculo: ");
                figura = new Circulo(dado.nextDouble());
            } else {
                System.out.print("Digite os três lados do triângulo: ");
                figura = new Triangulo(dado.nextDouble(), dado.nextDouble(), dado.nextDouble());
            }

            System.out.println("Área da figura: " + figura.calcularArea());
        } else
            System.out.print("Número inválido");

    }
}
