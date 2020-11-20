package Questao_9;

import java.util.Scanner;

public class AppTabuadaSoma {
    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        Scanner dado = new Scanner(System.in);

        int valor;

        do {
            System.out.print("Digite um valor: ");
            valor = dado.nextInt();

            if (valor <= 0)
                System.out.println("O VALOR DEVE SER POSITIVO");
        } while (valor <= 0);

        tabuada.setNumero(valor);
        tabuada.imprimirSoma();
    }
}
