package Questao_1;

import java.util.Scanner;

public class AppNotas {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        aluno.setNota((byte)0, dado.nextFloat());
        System.out.print("Digite a nota 2: ");
        aluno.setNota((byte)1, dado.nextFloat());
        System.out.print("Digite a nota 3: ");
        aluno.setNota((byte)2, dado.nextFloat());

        System.out.println("Média: " + aluno.mediaNotas());
        System.out.println("Situação: " + aluno.situacao());
    }
}
