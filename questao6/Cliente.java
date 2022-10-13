package questao6;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<ContaCorrente> contas;
    public Cliente(){}

    public Cliente(String nome){
        this.nome = nome;
        this.contas = new ArrayList<ContaCorrente>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ContaCorrente> getContas() {
      return contas;
    }

    public void setContas(ArrayList<ContaCorrente> contas) {
      this.contas = contas;
    }

    public void addConta(ContaCorrente conta){
        this.contas.add(conta);
    }

    public ContaCorrente getConta(int i){
        return contas.get(i);
    }
    @Override
    public String toString(){
        return "Nome do Cliente: " + this.nome;
    }
}
