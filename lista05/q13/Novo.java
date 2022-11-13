package lista05.q13;

public class Novo extends Imovel{
    
    private double adicional;

    public double getAdicional() {
        return this.adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void imprimeAdicional () {
        System.out.println("Adicional: " + adicional);
    }

}
