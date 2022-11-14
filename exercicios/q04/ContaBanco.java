package exercicios.q04;

public class ContaBanco {

    public int numeroConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // metodos da conta
    public void abrirConta (String t) {
            this.tipo = t;
            this.status = true;
            if ( t.equals("CC") || t.equals("cc") ) 
                this.saldo = 50;
            if ( t.equals("CP") || t.equals("cp")) 
                this.saldo = 150;
    }

    public void fecharConta () {
        if ( status != false  && saldo == 0 ) {
            this.status = false;
        } else {
            if ( saldo != 0 ) 
                System.out.println("Não é possivel fechar a conta, pois ainda existe saldo a ser retirado.");
            if ( status == false )
                System.out.println("Não existe uma conta para ser fechada.");
        }
    }

    public void depositar ( double valor ) {
        if ( status == true )
            this.saldo = this.saldo + valor;
        else 
            System.out.println("Conta não existe");
    }

    public void sacar ( double valor ) {
        if ( this.saldo >= valor )
            this.saldo = this.saldo - valor;
        else 
            if ( this.saldo < valor ) 
                System.out.println("Saldo insuficiente");
            if ( this.status == false )
                System.out.println("Conta não existe ");
    }

    public void pagarMensalidade () {
    
    }

}
