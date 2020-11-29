package Questao3;

public class AppMatrizR {
    public static void main(String[] args) {
        Matriz mat = new Matriz((byte)4, (byte)4);

        mat.setLinha((byte)0, new int[]{2, 5, 12, 9});
        mat.setLinha((byte)1, new int[]{7, 8, 0, 10});
        mat.setLinha((byte)2, new int[]{11, 2, 8, 4});
        mat.setLinha((byte)3, new int[]{2, 5, 9, 9});

        int[][] matrizR = mat.getMatrizR();

        System.out.println("Matriz R:\n");
        for (byte i=0; i < 4; i++) {
            for (byte j=0; j < 4; j++)
                System.out.print(matrizR[i][j]+ "\t");
            System.out.println();
        }
    }
}
