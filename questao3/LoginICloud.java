package questao3;

import exercicio1.LoginInterface;

public class LoginICloud implements LoginInterface{
  @Override
  public void fazerLogin() {
    System.out.println("Login pela Apple");
  }
}
