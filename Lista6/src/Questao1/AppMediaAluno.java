package Questao1;

public class AppMediaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafael", (short)12, (short)8, (short)2002, 5.6f, 9.9f, 8f);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getNascimento()[0]+"/"+aluno1.getNascimento()[1]+"/"+aluno1.getNascimento()[2]);
        System.out.println(aluno1.getMedia());
    }
}
