package Questao4;

import java.util.Scanner;

public class AppVendas {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        Scanner dado = new Scanner(System.in);

        produto1.setNome("Refigerante");
        produto2.setNome("Pipoca");
        produto3.setNome("Condicionador");

        System.out.print(produto1.getNome() + " | Preço de custo: ");
        produto1.setPrecoCusto(dado.nextFloat());
        System.out.print(produto1.getNome() + " | Preço de venda: ");
        produto1.setPrecoVenda(dado.nextFloat());
        System.out.println("Margem de lucro: R$" + produto1.calcularMargemLucro() + " - " + produto1.getMargemLucroPorcentagem() + "%\n");

        System.out.print(produto2.getNome() + " | Preço de custo: ");
        produto2.setPrecoCusto(dado.nextFloat());
        System.out.print(produto2.getNome() + " | Preço de venda: ");
        produto2.setPrecoVenda(dado.nextFloat());
        System.out.println("Margem de lucro: R$" + produto2.calcularMargemLucro() + " - " + produto2.getMargemLucroPorcentagem() + "%\n");

        System.out.print(produto3.getNome() + " | Preço de custo: ");
        produto3.setPrecoCusto(dado.nextFloat());
        System.out.print(produto3.getNome() + " | Preço de venda: ");
        produto3.setPrecoVenda(dado.nextFloat());
        System.out.println("Margem de lucro: R$" + produto3.calcularMargemLucro() + " - " + produto3.getMargemLucroPorcentagem() + "%\n");
    }
}
