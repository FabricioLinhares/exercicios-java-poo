package Questao_9;

import java.util.Scanner;

public class AppConsumoEnergia {
    public static void main(String[] args) {
        Energia energia = new Energia();
        Residencia casa = new Residencia();

        Scanner dado = new Scanner(System.in);

        System.out.print("Digite o salário mínimo atual: ");
        energia.setCustoKW(dado.nextFloat()/5);
        System.out.print("Digite o consumo da casa: ");
        casa.setEnergiaConsumida(dado.nextFloat());

        float valorEnergia = energia.calcularGasto(casa.getEnergiaConsumida(), false);
        float valorDesconto = energia.calcularGasto(casa.getEnergiaConsumida(), true);

        System.out.println("Valor do KW: " + energia.getCustoKW());
        System.out.println("Valor a ser pago: " + valorEnergia);
        System.out.println("Valor com desconto: " + valorDesconto);
    }
}
