package Questao5;

public class AppDadosTurma {
    public static void main(String[] args) {
        Turma turma = new Turma((byte)5);

        turma.setAluno((byte)0, new Aluno("Francisco", 4.9f));
        turma.setAluno((byte)1, new Aluno("Fellipe", 8.6f));
        turma.setAluno((byte)2, new Aluno("Rafael", 3.1f));
        turma.setAluno((byte)3, new Aluno("Marcos", 9.75f));
        turma.setAluno((byte)4, new Aluno("Aluana", 7.9f));

        System.out.println("Aluno com maior média: " + turma.getMaiorMediaNome());

        String[] reprovados = turma.getReprovados();
        System.out.print("Alunos Reprovados: ");
        for (byte i=0; i < reprovados.length; i++)
            System.out.print(reprovados[i] + " ");
    }
}
