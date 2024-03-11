package lanchonete;

public class Produto {
    private String nome;
    private double preco;
    private Fornecedor fornecedor;
    private Imposto imposto;

    public Produto(String nome, double preco, Fornecedor fornecedor, Imposto imposto) {
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.imposto = imposto;
    }

    // Método para calcular o preço com imposto
    public double calcularPrecoComImposto() {
        return preco * (1 + imposto.getTaxa());
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }
}