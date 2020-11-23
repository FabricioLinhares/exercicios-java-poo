package Questao2;

public class Item {
    private int codigo;
    private Produto produto;
    private byte quantidade;

    public Item(int codigo, Produto produto, byte quantidade) {
        this.setCodigo(codigo);
        this.setProduto(produto);
        this.setQuantidade(quantidade);

        produto.setQuantidade((short)(produto.getQuantidade() - quantidade));
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public byte getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(byte quantidade) {
        this.quantidade = quantidade;
    }

    public float custo() {
        return produto.getPreco() * quantidade;
    }
}
