package Questao1;

public class Pessoa {
    private String nome;
    private short[] nascimento = new short[3];

    public Pessoa(String nome, short diaNasc, short mesNasc, short anoNasc) {
        this.setNome(nome);
        this.getNascimento()[0] = diaNasc;
        this.getNascimento()[1] = mesNasc;
        this.getNascimento()[2] = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short[] getNascimento() {
        return nascimento;
    }

    public void setNascimento(short[] nascimento) {
        this.nascimento = nascimento;
    }
}