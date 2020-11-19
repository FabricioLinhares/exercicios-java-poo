package Questao_4;

import java.util.Scanner;

public class AppCalculaEstatisticas {
    public static void main(String[] args) {
        Jogador[] jogadores = new Jogador[5];

        Scanner dado = new Scanner(System.in);

        for (byte i=0; i < 5; i++) {
            jogadores[i] = new Jogador();
            System.out.print("Nome do jogador " + (i+1) + ": ");
            jogadores[i].setNome(dado.next());
            System.out.print("Idade do jogador " + (i+1) + ": ");
            jogadores[i].setIdade(dado.nextByte());
            System.out.print("Peso do jogador " + (i+1) + ": ");
            jogadores[i].setPeso(dado.nextFloat());
            System.out.println();
        }

        Estatisticas estatisticas = new Estatisticas();
        estatisticas.setJogadores(jogadores);

        System.out.println("Menores de 18: " + estatisticas.menoresDezoito());
        System.out.println("Media de idade: " + estatisticas.mediaIdade());
        System.out.println("Jogadores com mais de 80Kg: " + estatisticas.porcentagemGordos() + "%");
    }
}
