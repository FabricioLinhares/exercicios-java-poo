package Questao3;

public class ImovelNovo extends Imovel {
    private float adicional=0.1f;

    public ImovelNovo(float preco) {
        super(preco);
        setAdicional(10);
    }

    public float getAdicional() {
        return adicional*100;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional / 100;
    }

    public float getAdicionalValor() {
        return preco * adicional;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;

        setAdicional(adicional);
    }

    @Override
    public float getPreco() {
        return preco * (1 + adicional);
    }
}
