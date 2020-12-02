package Questao3;

public class ImovelVelho extends Imovel {
    private float desconto=0.3f;

    public ImovelVelho(float preco) {
        super(preco);
        setDesconto(10);
    }

    public float getDesconto() {
        return desconto * 100;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto / 100;
    }

    public float getDescontoValor() {
        return preco * desconto;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;

        setDesconto(desconto);
    }

    @Override
    public float getPreco() {
        return preco * (1 - desconto);
    }
}
