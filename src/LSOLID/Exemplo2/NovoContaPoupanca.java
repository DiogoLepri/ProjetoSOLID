
public class ContaPoupanca implements IConta {
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void aplicarRendimento(double taxa) {
        saldo += saldo * taxa;
    }
}
