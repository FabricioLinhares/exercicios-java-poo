package Questao6;

public class Bicicleta extends Veiculo {
    @Override
    public void listarVerificacoes() {
        System.out.println("Bicicleta.listarVerificacoes()");
    }

    @Override
    public void ajustar() {
        System.out.println("Bicicleta.ajustar()");
    }

    @Override
    public void limpar() {
        System.out.println("Bicicleta.limpar()");
    }
}
