package lista05.q13;

public class Imovel {
    
    //propriedades 
    private String endereco;
    private double preco;

    public Imovel (String e, double p) {
        this.endereco = e;
        this.preco = p;
    }

    //setters e getters
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calculaPreco () {
        return this.getPreco();
    }

    public void printDados() {
        System.out.println("Dados : \n Preco: " + getPreco() + "\n" + "Endereco: " + getEndereco());
    }

}
