package Questao5;

public class PessoaIMC extends Pessoa {
    private final double peso;
    private final double altura;

    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento);

        this.peso = peso;
        this.altura = altura;
    }

    public double calculaIMC(double altura, double peso) {
        return peso / (altura*altura);
    }

    public double resultIMC() {
        return peso / (altura*altura);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}
