package questao1;

public class Main {
  public static void main(String[] args) {
    Compra compra = new Compra();
    Item[] itens = {new Item("Banana", 5.0),
                    new Item("Maçâ", 6.0),
                    new Item("Uva", 5.0)};
    Produto produto1 = new Produto("Cesta de Frutas", itens);
    compra.adicionarProduto(produto1);
    System.out.println(compra.listarProdutos());
    System.out.println("Valor total da compra: "+compra.totalCompra());
    
    Item[] itens2 = {new Item("Barbeador", 5.0),
                    new Item("Escova de dentes", 6.0),
                    new Item("Pasta de Dentes", 5.0)};
    Produto produto2 = new Produto("Higiêne Pessoal", itens2);
    compra.adicionarProduto(produto2);
    System.out.println(compra.listarProdutos());
    System.out.println("Valor total da compra: "+compra.totalCompra());

  }
}
