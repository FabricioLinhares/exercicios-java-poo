package Questao6;

import java.util.Random;

public class Oficina {

    public Veiculo proximo() {
        Random r = new Random();
        int valor = r.nextInt() % 2;

        if (valor == 0)
            return new Automovel();
        else
            return new Bicicleta();
    }

    public void manutencao(Veiculo v) {
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();

        if (v instanceof Automovel)
            ((Automovel) v).mudarOleo();

        System.out.println();
    }
}
