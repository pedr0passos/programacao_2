package exercicios.q02;

import java.util.Scanner;

public class Mp3 extends Arquivo{
    // propriedades
    // kbytes, preco e autor
    private int numeroDownloads;

    // getters e setters 
    public int getNumeroDownloads() {
        return this.numeroDownloads;
    }

    public void setNumeroDownloads(int numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    // métodos da classe
    
    // construtores
    public Mp3 () {
        this(0,0.0,"Nenhum",0);
    }
    public Mp3(int k, double p, String a, int d ) {
        super(k,p,a);
        setNumeroDownloads(d);
    }

    public String getTipo () {
        return ("Mp3: ");
    }
    public String getDetalhes() {
        return ("Mp3: Autor: " + getAutor()  + " Preco: " + getPreco() + " kBytes: " + getKbytes() + "Número de Downloads: " + getNumeroDownloads());
    }
    public void inserirDados () {
        // chamando inserirDados da superclasse
        super.inserirDados();
        // agora inserindo numero de downloads
        Scanner scan = new Scanner(System.in);
        int nD;
        // inserindo os dados 
        System.out.print("Digite o número de Downloads: ");
        System.out.println();
        nD = scan.nextInt();

        setNumeroDownloads(nD);
        
    }
}
