package lanchonete;

public class Imposto {
    private double taxa;

    public Imposto(double taxa) {
        this.taxa = taxa;
    }

    // Métodos Getters e Setters
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}