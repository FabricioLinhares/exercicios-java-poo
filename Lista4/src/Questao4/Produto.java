package Questao4;

public class Produto {
    private String nome;
    private float precoCusto;
    private float precoVenda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        if (precoVenda >= precoCusto)
            this.precoVenda = precoVenda;
        else
            System.out.println("[ERRO] O preço de venda dado é menor que o de custo, logo foi rejeitado.");
    }

    public float calcularMargemLucro() {
        return precoVenda - precoCusto;
    }

    public float getMargemLucroPorcentagem() {
        return calcularMargemLucro()/precoVenda;
    }
}
