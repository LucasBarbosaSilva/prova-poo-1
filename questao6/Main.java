package questao6;

public class Main{
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Thiago Santos");
        Cliente c2 = new Cliente("Barbalho Souza");

        ContaCorrente cc1 = new ContaCorrente(c1, 100);
        ContaEspecial ce1 = new ContaEspecial(c1, 50, 100);
        ContaCorrente cc2 = new ContaCorrente(c2, 112);

        c1.addConta(cc1);
        c1.addConta(ce1);
        c2.addConta(cc2);

        System.out.println("Operações na conta corrente do cliente 1:");
        c1.getConta(0).sacar(100);
        System.out.println();
        c1.getConta(0).sacar(100);
        System.out.println();
        c1.getConta(0).depositar(80);
        System.out.println();
        c1.getConta(0).sacar(100);
        System.out.println();
        c1.getConta(0).transferir(c1.getConta(1), 70);
        System.out.println();

        System.out.println("Operações na conta especial do cliente 1:");
        System.out.println(c1.getConta(1).toString());
        c1.getConta(1).sacar(100);
        System.out.println();
        c1.getConta(1).sacar(200);
        System.out.println();
        c1.getConta(1).depositar(50);
        System.out.println();
        c1.getConta(1).transferir(c1.getConta(0), 80);
        System.out.println();
        c1.getConta(1).transferir(c1.getConta(0), 30);
        System.out.println();

        System.out.println("Operações na conta corrente do cliente 2:");
        c2.getConta(0).sacar(100);
        System.out.println();
        c2.getConta(0).sacar(100);
        System.out.println();
        c2.getConta(0).depositar(80);
        System.out.println();
        c2.getConta(0).sacar(100);
        System.out.println();       
    }
}