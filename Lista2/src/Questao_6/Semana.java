package Questao_6;

public class Semana {
    public String getDia(byte numDia) {
        switch (numDia) {
            case 1:
                return "segunda-feira";
            case 2:
                return "terça-feira";
            case 3:
                return "quarta-feira";
            case 4:
                return "quinta-feira";
            case 5:
                return "sexta-feira";
            case 6:
                return "sábado";
            case 7:
                return "domingo";
            default:
                return "DIA INVÁLIDO";
        }
    }
}