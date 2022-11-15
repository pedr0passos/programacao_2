package lista05.q13;

public class Velho extends Imovel{
    
    private double desconto;

    public double getDesconto () {
        return this.desconto;
    }

    public void printDesconto () {
        System.out.println("Desconto: " + this.desconto);
    }

}
