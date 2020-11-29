package Questao5;

public class Aluno {
    private final String nome;
    private final float media;

    public Aluno(String nome, float media) {
        this.nome = nome;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public float getMedia() {
        return media;
    }
}
