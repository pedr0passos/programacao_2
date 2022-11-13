public class Vip extends Ingresso {
    
    private double adicionalVip;

    // getters e setters 
    public double getAdicionalVip() {
        return this.adicionalVip;
    }

    public void setAdicionalVip(double adicionalVip) {
        this.adicionalVip = adicionalVip;
    }
    // fim dos getters e setters

    // retorna o valor do vip
    public double valorVip ( ) {
        return ( getValor() + getAdicionalVip());
    }


}
