package questao2;

public class Main {
    public static void main(String[] args) {
        Estacionamento e1 = new Estacionamento();
        Estacionamento e2 = new Estacionamento();

        Carro c1 = new Carro("xyz073", "Aquelle", "TujaSabbi", 3);
        Carro c2 = new Carro("syc370", "Inje", "EitaGta", 4);
        Carro c3 = new Carro("fso737", "Bora", "Sigura", 5);

        System.out.println("--- Estacionamento AGES ---");
        e1.adicionar_Carro(c1);
        e1.adicionar_Carro(c2);
        e1.listar_Carros();
        System.out.println();
        e1.quantidade_pessoas_total();

        System.out.println("\n--- Estacionamento TENDO ----");
        e2.adicionar_Carro(c3);
        e2.adicionar_Carro(c2);
        e2.listar_Carros();
        System.out.println();
        e2.quantidade_pessoas_total();
    }
}
