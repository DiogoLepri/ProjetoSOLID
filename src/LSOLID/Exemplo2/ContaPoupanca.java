package LSOLID.Exemplo2;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void sacar(double valor) {
        throw new UnsupportedOperationException("Resgate não é permitido direto.");
    }
}
