package questao6;

public class ContaCorrente {
    private Cliente cliente;
    protected float saldo;

    public ContaCorrente(){}

    public ContaCorrente(Cliente cliente, float saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Valor de R$" + valor + " depositado.");
        this.saldo = this.saldo + valor;
        System.out.println(this.toString());
    }

    protected boolean sacar(float valor){
        if (valor <= this.saldo){
            System.out.println("Cliente: " + this.getCliente().getNome());
            System.out.println("Conta Corrente");
            System.out.println("Saque no valor de R$" + valor + " efetuado.");
            this.saldo = this.saldo - valor;
            System.out.println(this.toString());
            return true;
        } else {
            System.out.println("Cliente: " + this.getCliente().getNome());
            System.out.println("Saque negado.");
            System.out.println("Valor excede o saldo disponível.");
            return false;
        }
        
    }

    public boolean transferir(ContaCorrente conta, float valor){
        if (valor <= this.saldo){
            System.out.println("Cliente: " + this.getCliente().getNome());
            System.out.println("Transferência no valor de R$" + valor + " efetuada.");
            this.saldo = this.saldo - valor;

            //ContaEspecial precisaria de algum tratamento nesse caso?

            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println(this.toString());
            return true;
        } else {
            System.out.println("Cliente: " + this.getCliente().getNome());
            System.out.println("Transferência negada.");
            System.out.println("Valor excede o saldo disponível.");
            return false;
        }
    }

    //VERSÕES FOCADAS NO RETURN BOOLEAN
    
    //public void depositar(float valor){
    //    this.saldo = this.saldo + valor;
    //}

    //protected boolean sacar(float valor){
    //    if (valor <= this.saldo){
    //        this.saldo = this.saldo - valor;
    //        return true;
    //    } else {
    //        return false;
    //    }
    //}

    //public boolean transferir(ContaCorrente conta, float valor){
    //    if (valor <= this.saldo){
    //        this.saldo = this.saldo - valor;
    //        conta.depositar(valor);
    //        return true;
    //    } else {
    //        return false;
    //    }
    //}
    


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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
