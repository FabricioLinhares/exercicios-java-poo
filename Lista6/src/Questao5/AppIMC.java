package Questao5;

public class AppIMC {
    public static void main(String[] args) {
        PessoaIMC[] pessoas = new PessoaIMC[5];

        pessoas[0] = new Homem("João", "27/02/2001", 90, 1.9);
        pessoas[1] = new Mulher("Lara", "23/06/1996", 80, 1.79);
        pessoas[2] = new Homem("João", "15/08/2004", 95.4, 1.68);
        pessoas[3] = new Homem("João", "30/01/1998", 54.68, 1.56);
        pessoas[4] = new Mulher("Letícia", "31/12/2000", 78.9, 1.68);

        for (byte i=0; i < 5; i++) {
            System.out.println(pessoas[i].toString());
            System.out.println("IMC: " + pessoas[i].resultIMC() + "\n");
        }
    }
}
