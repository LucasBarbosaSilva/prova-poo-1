package questao1;

import java.util.ArrayList;
import java.util.List;

public class Compra {
  private List<Produto> produtos;
  private double valorTotalCompra;
  public Compra(){
    this.produtos = new ArrayList<Produto>();
  }
  public void adicionarProduto(Produto produto){
    this.produtos.add(produto);
  }

  public double totalCompra(){
    double valor = 0.0;
    for(Produto produto: produtos){
      valor = valor + produto.getValorTotal();
    }
    this.valorTotalCompra = valor;
    return this.valorTotalCompra;
  }
  
  public String listarProdutos(){
    String texto = "Produtos na compra:\n";
    for (Produto produto: produtos){
      texto = texto + produto.getListaItens();
    }
    return texto;
  }
}