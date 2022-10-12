package questao6;

public class ContaCorrente {
    protected float saldo;

    public ContaCorrente(){}

    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }

    public void depositar(float valor){
        System.out.println("Valor de R$" + valor + " depositado.");
        this.saldo = this.saldo + valor;
        this.toString();
    }

    protected boolean sacar(float valor){
        if (valor <= this.saldo){
            System.out.println("Saque no valor de R$" + valor + "efetuado.");
            this.saldo = this.saldo - valor;
            this.toString();
            return true;
        } else {
            System.out.println("Saque negado.");
            System.out.println("Valor excede o saldo disponível.");
            return false;
        }
        
    }

    public boolean transferir(ContaCorrente conta, float valor){
        if (valor <= this.saldo){
            System.out.println("Transferência no valor de R$" + valor + "efetuada.");
            this.saldo = this.saldo - valor;

            //ContaEspecial precisaria de algum tratamento nesse caso?

            conta.setSaldo(conta.getSaldo() + valor);
            this.toString();
            return true;
        } else {
            System.out.println("Transferência negada.");
            System.out.println("Valor excede o saldo disponível.");
            return false;
        }
    }

    @Override
    public String toString(){
        return "Saldo atual da conta: R$" + this.saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
