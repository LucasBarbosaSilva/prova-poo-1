package questao6;

public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(Cliente cliente, float saldo, float limite){
        super(cliente, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor){
       if (valor <= (this.saldo + this.limite)){
            System.out.println("Cliente: " + this.getCliente().getNome());
            System.out.println("Conta Especial");
            System.out.println("Saque no valor de R$" + valor + " efetuado.");
            this.saldo = this.saldo - valor;
            System.out.println(this.toString());
            return true;
        } else {
            System.out.println("Saque negado.");
            System.out.println("Valor excede o limite disponível.");
            return false;
        }
    }

    @Override
    public String toString(){
        return "Saldo atual da conta: R$" + this.saldo + "\nLimite disponível: " + this.limite;
    }
}
