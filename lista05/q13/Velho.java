package lista05.q13;

public class Velho extends Imovel{
    
    public Velho(String e, double p) {
        super(e, p);
        //TODO Auto-generated constructor stub
    }

    private double desconto;

    public double getDesconto () {
        return this.desconto;
    }

    public void printDesconto () {
        System.out.println("Desconto: " + this.desconto);
    }

}
