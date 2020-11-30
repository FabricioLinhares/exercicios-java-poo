package Questao6;

public class Data {
    private final int[] data1;
    private final int[] data2;

    public Data(int[] data1, int[] data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public int[] getData3() {
        final int tamanho = data1.length + data2.length;
        int[] data3 = new int[tamanho];
        int index=0;

        for (int i=0; i < data1.length; i++)
            data3[index++] = data1[i];

        for (int i=0; i < data2.length; i++)
            data3[index++] = data2[i];

        return data3;
    }
}
