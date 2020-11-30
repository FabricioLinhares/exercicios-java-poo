package Questao7;

public class AppPalindromo {
    public static void main(String[] args) {
        Palavra palavra1 = new Palavra(new char[]{'o', 'v', 'o'});
        Palavra palavra2 = new Palavra(new char[]{'a', 'v', 'o', 'n'});

        System.out.println("Palavra 1 é palindromo? " + palavra1.isPalindromo());
        System.out.println("Palavra 2 é palindromo? " + palavra2.isPalindromo());
    }
}
