package exercicios.q03;

import java.util.Scanner;

public class Moto extends Veiculos {

    private int ano;

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Moto (String nome, double preco, int ano ) {
        super(nome, preco);
        this.ano = ano;
    }

    public void insertData() {

        Scanner scan = new Scanner (System.in);
        double p;
        String m;
        
        

    }

} 
