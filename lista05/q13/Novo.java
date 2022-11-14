package lista05.q13;

public class Novo extends Imovel{
    
    private double adicional;
    public static int contador = 0;

    public double getAdicional() {
        return this.adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void imprimeAdicional () {
        System.out.println("Adicional: " + adicional);
    }

    public void inserirAdicional () {
        if ( contador != 0 )
            preco = getPreco() + adicional;

    }

}
