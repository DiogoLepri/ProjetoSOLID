// ProcessadorEncomendas.java (depois)
import java.util.Scanner;

public class ProcessadorEncomendas {

    private EscritorArquivoEncomenda escritor;
    
    public ProcessadorEncomendas(EscritorArquivoEncomenda escritor) {
        this.escritor = escritor;
    }
    
    public void processar() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            String idEncomenda = sc.nextLine();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            double valorFrete = peso * 10;
            System.out.println("Valor do frete calculado: " + valorFrete);

            escritor.salvar(idEncomenda, valorFrete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        EscritorArquivoEncomenda escritor = new EscritorArquivoEncomenda();
        new ProcessadorEncomendas(escritor).processar();
    }
}
