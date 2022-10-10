package questao1;

public class Item {
  private String nome;
  private double preco;

  public Item(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
  }

  public double getPreco() {
    return preco;
  }

  public String getDetalhesItem(){
    return this.nome + " "+ this.preco;
  }
}
