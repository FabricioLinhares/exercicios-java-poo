package Questao_1;

public class Aluno {
    private static final float[] notas = new float[3];

    public float getNota(byte notaid) {
        return notas[notaid];
    }

    public void setNota(byte notaid, float valor) {
        if (notaid >=0 && notaid < 3)
            if (valor >= 0 && valor <= 10)
                notas[notaid] = valor;
    }

    public float mediaNotas() {
        return (notas[0]+notas[1]+notas[2]) / 3;
    }

    public String situacao() {
        float media = mediaNotas();
        if (media >= 0 && media < 3)
            return "Reprovado";
        else if (media >= 3 && media < 7)
            return "Prova Final";
        else if (media >= 7 && media <= 10)
            return "Aprovado";
        else
            return "SITUAÇÃO INVÁLIDA";
    }
}
