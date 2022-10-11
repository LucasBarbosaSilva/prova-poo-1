package questao2;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Carro> carros;

    public Estacionamento(){
        this.carros = new ArrayList<Carro>();
    }

    public void adicionar_Carro(Carro carro){
        carros.add(carro);
    }

    public void listar_Carros(){
        int num_carro = 1;
        for (Carro cada_Carro : carros){
            System.out.println("\nCarro " + num_carro);
            System.out.println(cada_Carro.toString());
            num_carro = num_carro + 1;
        }
    }

    public void quantidade_pessoas_total(){
        int total_pessoas = 0;
        for (Carro cada_Carro : carros){
            total_pessoas = total_pessoas + cada_Carro.getQuantidade_pessoas();
        }
        System.out.println("Quantidade total de pessoas no Estacionamento: " + total_pessoas);
    }
}
