package Questao_4;

public class Estatisticas {
    private Jogador[] jogadores;
    private byte quantidadeJogadores;

    public void setJogadores(Jogador[] novosJogadores) {
        jogadores = novosJogadores;
        quantidadeJogadores = (byte)novosJogadores.length;
    }

    public byte menoresDezoito() {
        byte menores=0;

        for (byte i=0; i < quantidadeJogadores; i++)
            if (jogadores[i].getIdade() < 18)
                menores++;

        return menores;
    }

    public float mediaIdade() {
        int soma=0;

        for (byte i=0; i < quantidadeJogadores; i++)
            soma += jogadores[i].getIdade();

        return (float)(soma*1.0/quantidadeJogadores);
    }

    public float porcentagemGordos() {
        byte gordos=0;

        for (byte i=0; i < quantidadeJogadores; i++)
            if (jogadores[i].getPeso() > 80)
                gordos++;

        return (float)(gordos * 100.0 / quantidadeJogadores);
    }
}
