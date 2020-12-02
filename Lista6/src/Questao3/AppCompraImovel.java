package Questao3;

import java.util.Scanner;

public class AppCompraImovel {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        float preco;
        byte tipoImovel;

        System.out.print("Qual é o preço do imovel? R$");
        preco = dado.nextFloat();

        do {
            System.out.print("Digite 1 para novo e 2 para velho: ");
            tipoImovel = dado.nextByte();
        } while (tipoImovel != 1 && tipoImovel != 2);

        if (tipoImovel == 1) {
            ImovelNovo imovel = new ImovelNovo(preco);
            System.out.println("Preço = R$" + imovel.getPreco());
        } else {
            ImovelVelho imovel = new ImovelVelho(preco);
            System.out.println("Preço = R$" + imovel.getPreco());
        }
    }
}
