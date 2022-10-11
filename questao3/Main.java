package questao3;

import exercicio1.Login;
import exercicio1.LoginApple;
import exercicio1.LoginFacebook;
import exercicio1.LoginForms;
import exercicio1.LoginGoogle;

public class Main {
  public static void main(String[] args) {
    Login login = new Login();
    login.fazLogin(new LoginApple());
    login.fazLogin(new LoginFacebook());
    login.fazLogin(new LoginForms());
    login.fazLogin(new LoginGoogle());
  }
}
