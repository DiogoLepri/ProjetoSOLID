
public class ContaBancaria implements IContaSaque {
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
