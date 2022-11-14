package exercicios.q03;

public class Veiculos {

    private String modelo;
    private double preco;

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //construtor
    public Veiculos (String nome, double preco ) {
        modelo = nome;
        this.preco = preco;
    }

    public void printDados () {
        System.out.println("Modelo: " + modelo + " Preco: " + preco );
    }

}
