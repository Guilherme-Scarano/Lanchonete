package lanchonete;

public class Caixa {
    private double saldo;

    public Caixa(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}