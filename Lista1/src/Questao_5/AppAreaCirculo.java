package Questao_5;

import java.util.Scanner;

public class AppAreaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        System.out.print("Digite o raio do circulo: ");
        Scanner dado = new Scanner(System.in);
        circulo.setRaio(dado.nextFloat());

        System.out.println("Area do circulo: " + circulo.area());
    }
}
