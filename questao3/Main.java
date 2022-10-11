package questao3;

public class Main {
  public static void main(String[] args) {
    Login login = new Login();
    login.fazLogin(new LoginICloud());
    login.fazLogin(new LoginFacebook());
    login.fazLogin(new LoginForms());
    login.fazLogin(new LoginGoogle());
  }
}
