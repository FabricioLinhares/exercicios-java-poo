package Questao1;

public class Aluno extends Pessoa {
    private float[] notas = new float[3];

    public Aluno(String nome, short diaNasc, short mesNasc, short anoNasc, float nota1, float nota2, float nota3) {
        super(nome, diaNasc, mesNasc, anoNasc);

        getNotas()[0] = nota1;
        getNotas()[1] = nota2;
        getNotas()[2] = nota3;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public float getMedia() {
        float soma=0;

        for (byte i=0; i < notas.length; i++)
            soma += notas[i];

        return soma / notas.length;
    }
}
