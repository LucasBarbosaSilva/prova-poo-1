package questao4;

public class CartaoCredito implements Modulo{
    private String conta;

    public CartaoCredito(String conta){
        this.conta = conta;
    }

    public void pagar(double valor){
        System.out.println("Valor de R$" + valor + " pago pelo Cartão de Crédito\nConta: " + this.conta);
    }
}
