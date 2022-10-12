package questao6;

public class Main{
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Thiago Santos");
        Cliente c2 = new Cliente("Barbalho Souza");

        ContaCorrente cc1 = new ContaCorrente(c1, 100);
        ContaEspecial ce1 = new ContaEspecial(c1, 50, 100);
        ContaCorrente cc2 = new ContaCorrente(c2, 112);

        cc1.sacar(20);

        System.out.println();

        cc1.sacar(80);

        System.out.println();

        cc1.sacar(110);

        System.out.println();

        cc2.depositar(28);

        System.out.println();

        ce1.sacar(90);

        System.out.println();

        ce1.sacar(110);

        System.out.println();

        cc2.transferir(cc1, 30);

        System.out.println();

        System.out.println(cc1.toString());
    }
}