package questao4;

public class Pix implements Modulo{
    private String chave_pix;

    public Pix(String chave_pix){
        this.chave_pix = chave_pix;
    }

    public void pagar(double valor){
        System.out.println("Valor de R$" + valor + " pago pelo PIX\nChave do PIX: " + this.chave_pix);  
    }
}
