package Questao_5;

public class AppProgressao {
    public static void main(String[] args) {
        imprimirProgressao((byte)1, (byte)32);
    }

    public static void imprimirProgressao(byte inicio, byte max) {
        for(byte i=inicio; i <= max; i = (byte)(2 * i))
            System.out.print(i + " ");
    }
}
