package Questao1;

import java.util.stream.StreamSupport;

public class AppLivros {
    public static void main(String[] args) {
        Livro livroArtes = new Livro("Artes", (byte)20);
        Livro livroCiencias = new Livro("Ciências", (byte)50);
        Livro livroIngles = new Livro("Inglês", (byte)89);

        System.out.println(livroArtes.getNome() + " | Exemplares: " + livroArtes.getExemplares());
        System.out.println(livroCiencias.getNome() + " | Exemplares: " + livroCiencias.getExemplares());
        System.out.println(livroIngles.getNome() + " | Exemplares: " + livroIngles.getExemplares());

        livroArtes.setExemplares((byte) 12);
        livroCiencias.setExemplares((byte) 25);
        livroIngles.setExemplares((byte) 98);
        System.out.println();

        System.out.println(livroArtes.getNome() + " | Exemplares: " + livroArtes.getExemplares());
        System.out.println(livroCiencias.getNome() + " | Exemplares: " + livroCiencias.getExemplares());
        System.out.println(livroIngles.getNome() + " | Exemplares: " + livroIngles.getExemplares());
    }
}
