package exercicios.q02;

import java.util.Scanner;

public class Mp4 extends Arquivo{
    // propriedades
    // kbytes, preco e autor
    private int numeroVisitas;

    // getters e setters 
    public int getnumeroVisitas() {
        return this.numeroVisitas;
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    // métodos da classe
    
    // construtores
    public Mp4 () {
        this(0,0.0,"Nenhum",0);
    }
    public Mp4(int k, double p, String a, int d ) {
        super(k,p,a);
        setNumeroVisitas(d);
    }

    public String getTipo () {
        return ("Mp4: ");
    }
    public String getDetalhes() {
        return ("Mp4: Autor: " + getAutor()  + " Preco: " + getPreco() + " kBytes: " + getKbytes() + "Número de Downloads: " + getnumeroVisitas());
    }
    public void inserirDados () {
        // chamando inserirDados da superclasse
        super.inserirDados();
        // agora inserindo numero de downloads
        Scanner scan = new Scanner(System.in);
        int nV;
        // inserindo os dados 
        System.out.print("Digite o número de Downloads: ");
        System.out.println();
        nV = scan.nextInt();

        setNumeroVisitas(nV);
        
    }
}
