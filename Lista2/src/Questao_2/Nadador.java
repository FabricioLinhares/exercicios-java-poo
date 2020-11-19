package Questao_2;

public class Nadador {
    private byte idade;

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        if (idade >= 0)
            this.idade = idade;
    }

    public String categoria() {
        if (idade >= 0 && idade <= 10)
            return "Infantil";
        else if (idade >= 11 && idade <= 15)
            return "Jovem";
        else if (idade >= 16 && idade <= 30)
            return "Adolescente";
        else if (idade >= 31 && idade <= 45)
            return "Adulto";
        else
            return "Sênior";
    }
}
