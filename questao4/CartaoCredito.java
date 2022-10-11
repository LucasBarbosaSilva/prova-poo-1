package questao4;

public class CartaoCredito implements Modulo{
    private String conta;
    private int parcelas_total;
    //private int[] fatura[];

    public CartaoCredito(String conta, int parcelas_total){
        this.conta = conta;
        this.parcelas_total = parcelas_total;
    }

    public void pagar(double valor){
    }
}
