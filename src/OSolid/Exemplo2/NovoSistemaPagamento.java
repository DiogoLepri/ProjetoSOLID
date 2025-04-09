
public class SistemaPagamento {
    
    private Pagamento metodoPagamento;

    public SistemaPagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    public void realizarPagamento(double valor) {
        metodoPagamento.realizarPagamento(valor);
    }
    
    public void setMetodoPagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    public static void main(String[] args) {
        // Exemplo de uso
        Pagamento pagamento = new PagamentoCartao(); // ou PagamentoPix, PagamentoBoleto
        SistemaPagamento sistema = new SistemaPagamento(pagamento);
        sistema.realizarPagamento(150.0);
    }
}
