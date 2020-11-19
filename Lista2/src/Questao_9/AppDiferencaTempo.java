package Questao_9;

public class AppDiferencaTempo {
    public static void main(String[] args) {
        Tempo relogio1 = new Tempo();
        Tempo relogio2 = new Tempo();

        relogio1.setHoras((byte)2);
        relogio1.setMinutos((byte)45);
        relogio1.setSegundos((byte)13);

        relogio2.setHoras((byte)6);
        relogio2.setMinutos((byte)29);
        relogio2.setSegundos((byte)56);

        System.out.println("Diferença de tempo: " + Math.abs(relogio1.totalSegundos() - relogio2.totalSegundos()));
    }
}
