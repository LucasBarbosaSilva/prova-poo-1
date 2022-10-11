package questao3;

import exercicio1.LoginInterface;

public class LoginGoogle implements LoginInterface{
  @Override
  public void fazerLogin() {
    System.out.println("Login pelo Google");
  }
}
