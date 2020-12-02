package Questao2;

public class TipoObjeto {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Object [] data = {"Lista 5", new Object(), i};

        for (byte j=0; j < data.length; j++) {
            System.out.print("[" + j + "] ");
            if (data[j] instanceof Integer)
                System.out.print("Inteiro\n");
            else if (data[j] instanceof String)
                System.out.print("String\n");
            else
                System.out.print("Objeto\n");
        }
    }
}
