package Questao5;

public class Pessoa {
    private final String nome;
    private final String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return "Nome: " + nome + "\nData de nascimento: " + dataNascimento;
    }
}
