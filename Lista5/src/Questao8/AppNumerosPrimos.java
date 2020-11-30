package Questao8;

public class AppNumerosPrimos {
    public static void main(String[] args) {
        Numeros num = new Numeros(new int[]{1, 43, 92, 123, 9, 22, 19, 17, 3, 11});

        int[][] primos = num.getPrimos();

        for (byte i=0; i < primos.length; i++)
            System.out.println("["+primos[i][0]+"]" + " " + primos[i][1]);
    }
}
