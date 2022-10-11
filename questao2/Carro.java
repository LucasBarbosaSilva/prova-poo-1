package questao2;

public class Carro{
    private String placa;
    private String modelo;
    private String marca;
    private int quantidade_pessoas;

    public Carro(String placa, String modelo, String marca, int quantidade_pessoas){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.quantidade_pessoas = quantidade_pessoas;
    }

    @Override
    public String toString(){
        return "Placa: " + this.placa + "\nModelo: " + this.modelo
        + "\nMarca: " + this.marca + "\nNúmero de Pessoas: " + this.quantidade_pessoas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade_pessoas() {
        return quantidade_pessoas;
    }

    public void setQuantidade_pessoas(int quantidade_pessoas) {
        this.quantidade_pessoas = quantidade_pessoas;
    }
}
