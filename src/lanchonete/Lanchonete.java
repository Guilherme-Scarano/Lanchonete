package lanchonete;

public class Lanchonete {
    public static void main(String[] args) {
        // Criar um fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor Pão", "Rua 2");

        // Criar um imposto
        Imposto imposto = new Imposto(0.1); // Imposto de 10%

        // Criar um produto associado ao fornecedor e imposto
        Produto produto = new Produto("Hambúrguer", 5.99, fornecedor, imposto);

        // Verificar os detalhes do produto
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: $" + produto.getPreco());
        System.out.println("Fornecedor do produto: " + produto.getFornecedor().getNome());
        System.out.println("Endereço do fornecedor: " + produto.getFornecedor().getEndereco());

        // Calcular o preço do produto com imposto
        double precoComImposto = produto.calcularPrecoComImposto();
        System.out.println("Preço do produto com imposto: $" + precoComImposto);

        // Criar um cliente
        Cliente cliente = new Cliente("Juca", "João");

        // Criar um estoque com uma quantidade de produtos
        Estoque estoque = new Estoque(10, produto);

        // Verificar a quantidade em estoque
        System.out.println("Quantidade em estoque do produto: " + estoque.getQuantidade());

        // Adicionar mais produtos ao estoque
        estoque.setQuantidade(estoque.getQuantidade() + 5);

        // Verificar a nova quantidade em estoque
        System.out.println("Nova quantidade em estoque do produto: " + estoque.getQuantidade());

        // Criar um caixa com um saldo inicial
        Caixa caixa = new Caixa(1000.0);

        // Verificar o saldo do caixa
        System.out.println("Saldo do caixa: $" + caixa.getSaldo());

        // Adicionar dinheiro ao caixa
        caixa.setSaldo(caixa.getSaldo() + 500.0);

        // Verificar o novo saldo do caixa
        System.out.println("Novo saldo do caixa: $" + caixa.getSaldo());

        // Criar um funcionário
        Funcionario funcionario = new Funcionario("Márcio", "Atendente");

        // Verificar os detalhes do funcionário
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Cargo do funcionário: " + funcionario.getCargo());
    }
}