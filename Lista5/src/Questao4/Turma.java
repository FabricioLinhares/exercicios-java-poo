package Questao4;

public class Turma {
    private final String[] alunosNome;
    private final float[] alunosMedia;
    private byte quantidadeReprovados=0;

    public Turma(byte quantidadeAlunos) {
        this.alunosNome = new String[quantidadeAlunos];
        this.alunosMedia = new float[quantidadeAlunos];
    }

    public void setAluno(byte index, String nome, float media) {
        this.alunosNome[index] = nome;
        this.alunosMedia[index] = media;

        if (media < 5)
            quantidadeReprovados++;
    }

    public String getMaiorMediaNome() {
        int indexMaior = 0;

        for (byte i=1; i < alunosNome.length; i++)
            if (alunosMedia[i] > alunosMedia[indexMaior])
                indexMaior = i;

        return alunosNome[indexMaior];
    }

    public String[] getReprovados() {
        String[] reprovados = new String[quantidadeReprovados];
        byte index=0;

        for (byte i=0; i < alunosNome.length; i++)
            if (alunosMedia[i] < 5)
                reprovados[index++] = alunosNome[i];

        return reprovados;
    }
}
