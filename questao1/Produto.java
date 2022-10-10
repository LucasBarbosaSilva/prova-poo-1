package questao1;

public class Produto {
  private String nome;
  private Item[] itens;
  private double valorTotal;

  public Produto(String nome, Item[] itens){
    this.nome = nome;
    this.itens = itens;
    this.valorTotal = this.valorTotal();
  }

  public Item[] getItens() {
    return itens;
  }

  public double getValorTotal() {
    return valorTotal;
  }
  
  public String getListaItens(){
    String info = this.nome+":\n";
    for (Item item: this.itens){
      info = info + item.getDetalhesItem()+"\n"; 
    }
    info = info+ "Valor total: "+this.valorTotal+"\n";
    return info;
  }
  public double valorTotal(){
    double valor = 0;
    for (Item item: this.itens){
      valor = valor + item.getPreco(); 
    }
    return valor;
  }
}
