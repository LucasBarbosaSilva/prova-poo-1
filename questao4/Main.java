package questao4;

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
    }
}
