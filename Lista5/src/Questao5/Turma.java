package Questao5;

public class Turma {
    private final Aluno[] alunos;
    private byte quantidadeReprovados=0;

    public Turma(byte quantidadeAlunos) {
        this.alunos = new Aluno[quantidadeAlunos];
    }

    public void setAluno(byte index, Aluno aluno) {
        this.alunos[index] = aluno;

        if (aluno.getMedia() < 5)
            quantidadeReprovados++;
    }

    public String getMaiorMediaNome() {
        int indexMaior = 0;

        for (byte i=1; i < alunos.length; i++)
            if (alunos[i].getMedia() > alunos[indexMaior].getMedia())
                indexMaior = i;

        return alunos[indexMaior].getNome();
    }

    public String[] getReprovados() {
        String[] reprovados = new String[quantidadeReprovados];
        byte index=0;

        for (byte i=0; i < alunos.length; i++)
            if (alunos[i].getMedia() < 5)
                reprovados[index++] = alunos[i].getNome();

        return reprovados;
    }
}
