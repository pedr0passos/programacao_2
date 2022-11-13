package lista05.q13;

public class Velho extends Imovel{
    
    private double desconto;

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void imprimeDesconto () {
        System.out.println("Desconto: " + desconto);
    }

}
