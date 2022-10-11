package questao5;

public abstract class UfalBluetooth {
  public void comunica(){
    abrirConexao();
    processaDados();
    fecharConexao();
  }

  public void abrirConexao(){
    System.out.println("Estabelecendo conexao...");
    System.out.println("Conectou!");
  }

  abstract void processaDados();

  public void fecharConexao(){
    System.out.println("Fechando conexao...");
    System.out.println("Fechou!");
  }
}
