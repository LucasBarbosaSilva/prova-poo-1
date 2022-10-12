package questao6;

public class ContaEspecial extends ContaCorrente{
    protected float saldo;
    private float limite;

    public ContaEspecial(float saldo, float limite){
        super(saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor){
        if (valor <= (this.saldo + this.limite) && this.saldo >= (0 - this.limite)){
            System.out.println("Saque no valor de R$" + valor + "efetuado.");
            this.saldo = this.saldo - valor;
            this.toString();
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
