package Questao5;

public class Homem extends PessoaIMC {
    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public double resultIMC() {
        double imc = super.resultIMC();

        if (imc < 20.7)
            System.out.println("Abaixo do peso ideal");
        else if (imc < 26.4)
            System.out.println("Peso ideal");
        else
            System.out.println("Acima do peso ideal");

        return imc;
    }
}
