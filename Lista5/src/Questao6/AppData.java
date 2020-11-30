package Questao6;

public class AppData {
    public static void main(String[] args) {
        int[] data1 = {5, 7, 12, 0, 9};
        int[] data2 = {4, 9, 8, 7};

        Data data = new Data(data1, data2);

        int[] data3 = data.getData3();

        for (int i=0; i < data3.length; i++)
            System.out.print(data3[i] + " ");
    }
}
