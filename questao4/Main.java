package questao4;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boleto b1 = new Boleto("0731245");
        Pix p1 = new Pix("cayo_exemplo@gmail.com");
        CartaoCredito c1 = new CartaoCredito("733333");

        b1.pagar(212.34);
        System.out.println();
        p1.pagar(121.43);
        System.out.println();
        c1.pagar(444.55);

        //System.out.println("Valor a ser pago: ");
        //double valor = sc.nextDouble();

        //System.out.println("1 - PIX\n2 - Cartão de Crédito\n3 - Boleto\n");
        //System.out.println("Digite o número correspondente ao método de pagamento: ");
        //int metodo = sc.nextInt();

        //switch(metodo){
        //    case 1:
        //    p1.pagar(valor);

        //    case 2:
        //    c1.pagar(valor);

        //    case 3:
        //    b1.pagar(valor);
        //}
    }
}
