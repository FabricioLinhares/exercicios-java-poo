package Questao_8;

import java.util.Scanner;

public class AppVerificaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        triangulo.setLado((byte)0, dado.nextInt());
        System.out.print("Digite o lado 2: ");
        triangulo.setLado((byte)1, dado.nextInt());
        System.out.print("Digite o lado 3: ");
        triangulo.setLado((byte)2, dado.nextInt());

        System.out.println("Tipo de triângulo: " + triangulo.tipo());
        dado.close();
    }
}
