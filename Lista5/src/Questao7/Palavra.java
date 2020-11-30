package Questao7;

public class Palavra {
    private char[] palavra;

    public Palavra(char[] palavra) {
        this.palavra = palavra;
    }

    public boolean isPalindromo() {
        for (int i=0; i < palavra.length; i++)
            if (palavra[i] != palavra[ (palavra.length-1) - i])
                return false;

        return true;
    }
}
