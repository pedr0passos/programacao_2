package lista_avaliativa.q05;

public class ContaBancaria {
    private double saldo;
    private double limite;

    public ContaBancaria(double valorSaldo, double valorLimite ) {
        this.saldo = valorSaldo;
        this.limite = valorLimite;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return this.limite;
    }

    public double getSaldoComLimite(){
        return (this.saldo + this.limite);
    }

    public boolean sacar (double valor) throws ContaException {
        
    }

}