package Questao_10;

import java.util.Scanner;

public class AppDezValores {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        Scanner dado = new Scanner(System.in);

        int[] valores = new int[10];
        int index=0;

        do {
            System.out.print("Digite o valor " + (index+1) + ": ");
            valores[index] = dado.nextInt();

            if (valores[index] >= 0)
                index++;
            else
                System.out.println("O VALOR DEVE SER POSITIVO");
        } while (index < 10);

        numeros.setValores(valores);
        System.out.println("Maior valor: " + numeros.maior());
        System.out.println("Soma: " + numeros.soma());
        System.out.println("Média: " + numeros.media());
    }
}
