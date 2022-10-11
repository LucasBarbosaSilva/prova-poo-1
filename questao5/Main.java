package questao5;

public class Main {
  public static void main(String[] args) {
    UfalBluePacotes ufalBluePacotes = new UfalBluePacotes();
    UfalBlueSerial ufalBlueSerial = new UfalBlueSerial();
    System.out.println("-------------------------");
    System.out.println("Comunicação com o módulo por serial:");
    ufalBlueSerial.comunica();
    System.out.println("-------------------------");
    System.out.println("Comunicação com o módulo por pacotes:");
    ufalBluePacotes.comunica();
  }
}
