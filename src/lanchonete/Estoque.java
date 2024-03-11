package lanchonete;

public class Estoque {
    private int quantidade;
    private Produto produto;

    public Estoque(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    // Métodos Getters e Setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}