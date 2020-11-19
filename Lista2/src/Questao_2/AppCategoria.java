package Questao_2;

import java.util.Scanner;

public class AppCategoria {
    public static void main(String[] args) {
        Nadador nadador = new Nadador();

        Scanner dado = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        nadador.setIdade(dado.nextByte());

        System.out.println("Categoria: " + nadador.categoria());
    }
}
