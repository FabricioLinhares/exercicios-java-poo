package Questao_3;

import java.util.Scanner;

public class AppConverterPesoLua {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Astro lua = new Astro();
        lua.setTaxaConversaoPeso((float)0.17);

        System.out.print("Digite o seu peso: ");
        Scanner dado = new Scanner(System.in);
        pessoa.setMassa(dado.nextFloat());

        System.out.print("Na Lua, seu peso seria o equivalente a " + lua.calcularPeso(pessoa.getMassa()) + " de peso na Terra.");
    }
}
