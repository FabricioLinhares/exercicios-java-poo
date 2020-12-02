package Questao3;

public class Imovel {
    private String endereco;
    protected float preco;

    public Imovel(float preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
