package Questao9;

public class AppConjuntos {
    private static void printArray(int[] array) {
        for (byte i=0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        int[] conjunto1 = {1, 2, 4, 9, 12, 19, 10, 3, 8, 11};
        int[] conjunto2 = {15, 19, 2, 80, 67, 18, 19, 0, 23, 9};

        Conjuntos universo = new Conjuntos(conjunto1, conjunto2);

        System.out.print("União: ");
        printArray(universo.getUniao());

        System.out.print("\nDiferença de X e Y: ");
        printArray(universo.getDiferenca());

        System.out.print("\nIntersecção: ");
        printArray(universo.getInterseccao());
    }
}
