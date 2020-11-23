package Questao2;

public class Venda {
    public static void main(String[] args) {
        Produto refrigerante = new Produto(12345, "Refrigerante 2L", (short)254, 8.50f);
        Produto pipoca = new Produto(12647, "Pipoca", (short)2560, 1.13f);

        System.out.println(refrigerante.getNome() + " | Estoque: " + refrigerante.getQuantidade());
        System.out.println(pipoca.getNome() + " | Estoque: " + pipoca.getQuantidade());

        Item item1 = new Item(1234, refrigerante, (byte)4);
        Item item2 = new Item(1235, pipoca, (byte)10);
        Item item3 = new Item(1236, refrigerante, (byte)1);
        System.out.println();

        System.out.println(refrigerante.getNome() + " | Estoque: " + refrigerante.getQuantidade());
        System.out.println(pipoca.getNome() + " | Estoque: " + pipoca.getQuantidade());
        System.out.println();

        System.out.println(item1.getQuantidade() + "x " + item1.getProduto().getNome() + " - R$" + item1.getProduto().getPreco() + " | Total: R$" + item1.custo());
        System.out.println(item2.getQuantidade() + "x " + item2.getProduto().getNome() + " - R$" + item2.getProduto().getPreco() + " | Total: R$" + item2.custo());
        System.out.println(item3.getQuantidade() + "x " + item3.getProduto().getNome() + " - R$" + item3.getProduto().getPreco() + " | Total: R$" + item3.custo());
    }
}
