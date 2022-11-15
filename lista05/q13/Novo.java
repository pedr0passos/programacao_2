package lista05.q13;

public class Novo extends Imovel{
    
    private double adicional;

    public Novo () {
        this("Nenhum", 0, 0);
    }

    public Novo (String e, double p, double a ) {
        super(e,p);
        this.adicional = a;
    }
    public double getAdicional () {
        return this.adicional;
    }

    public void printAdicional() {
        System.out.println("Adicional: " + this.adicional);
    }

}
