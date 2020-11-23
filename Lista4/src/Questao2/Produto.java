package Questao2;

public class Produto {
    private int codigo;
    private String nome;
    private short quantidade;
    private float preco;

    public Produto(int codigo, String nome, short quantidade, float preco) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
