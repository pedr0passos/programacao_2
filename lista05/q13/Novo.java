package lista05.q13;

public class Novo extends Imovel{
    
    private double adicional;

    public Novo () {
        
    }

    public double getAdicional () {
        return this.adicional;
    }

    public void printAdicional() {
        System.out.println("Adicional: " + this.adicional);
    }

}
