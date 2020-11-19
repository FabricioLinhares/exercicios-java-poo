package Questao_10;

import java.util.Scanner;

public class AppCustoConsulta {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        paciente.setNome(dado.nextLine());
        System.out.print("Digite seu sexo: ");
        paciente.setSexo(dado.nextLine());
        System.out.print("Digite sua altura: ");
        paciente.setAltura(dado.nextFloat());
        System.out.print("Digite seu peso: ");
        paciente.setPeso(dado.nextFloat());
        System.out.print("Digite sua idade: ");
        paciente.setIdade(dado.nextByte());

        System.out.println("Preço da consulta: R$" + paciente.custoConsulta());
    }
}
