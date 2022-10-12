package questao4;

public class Boleto implements Modulo{
    private String codigo_boleto;

    public Boleto(String codigo_boleto){
        this.codigo_boleto = codigo_boleto;
    }

    public void pagar(double valor){
        System.out.println("Valor de R$" + valor + " pago pelo Boleto\nCódigo do Boleto: " + this.codigo_boleto);
    }
}
