package questao4;

public class Pix implements Modulo{
    private String conta;
    private int senha;
    private String num_pix;

    public Pix(String conta, int senha, String num_pix){
        this.conta = conta;
        this.senha = senha;
        this.num_pix = num_pix;
    }

    public void pagar(double valor){
        //Seria um scanner
        System.out.println("Insira a senha: " + this.senha);
        System.out.println("Valor pago por PIX: " + valor + "\nConta: " + this.conta);    
    }
}
