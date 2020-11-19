package Questao_1;

import java.util.Scanner;

public class AppConverteGalao {
    public static void main(String[] args) {
        Galao galao = new Galao();

        System.out.print("Digite a quantidade de galões: ");
        Scanner dado = new Scanner(System.in);
        galao.setValor(dado.nextByte());
        System.out.println("Litros totais: " + galao.litros());
        dado.close();
    }
}
