package Questao1;

public class Livro {
    private String nome;
    private byte exemplares;

    public Livro(String nome, byte exemplares) {
        this.setNome(nome);
        this.setExemplares(exemplares);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getExemplares() {
        return exemplares;
    }

    public void setExemplares(byte exemplares) {
        this.exemplares = exemplares;
    }
}
