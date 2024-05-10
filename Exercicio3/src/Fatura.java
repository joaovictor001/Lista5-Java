import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private double valorParcela;
    private double valorTotal;

    public Fatura(double valorParcela, double valorTotal) {
        this.valorParcela = valorParcela;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return String.format("Valor a ser pago %.2f",valorParcela);
    }
}
