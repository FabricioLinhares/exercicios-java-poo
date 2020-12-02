package Questao5;

public class Mulher extends PessoaIMC {
    public Mulher(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public double resultIMC() {
        double imc = super.resultIMC();

        if (imc < 19)
            System.out.println("Abaixo do peso ideal");
        else if (imc < 25.8)
            System.out.println("Peso ideal");
        else
            System.out.println("Acima do peso ideal");

        return imc;
    }
}