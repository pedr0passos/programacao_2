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
        if ( valor <= getSaldoComLimite() && valor < 500 ) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) throws ContaException {
        if ( valor < 1000 )
            saldo = saldo+valor;
        else 
            throw new ContaException("Deposito maior que R$1000,00");
    }




}