package Questao6;

public class Automovel extends Veiculo {
    @Override
    public void listarVerificacoes() {
        System.out.println("Automovel.listarVerificacoes()");
    }

    @Override
    public void ajustar() {
        System.out.println("Automovel.ajustar()");
    }

    @Override
    public void limpar() {
        System.out.println("Automovel.limpar()");
    }

    public void mudarOleo() {
        System.out.println("Automovel.mudarOleo()");
    }
}
