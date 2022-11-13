package exercicios.q02;

import java.util.Scanner;

public class Arquivo {
    // propriedades 
    private int kbytes;
    private double preco;
    private String autor;

    // getters e setters 
    public int getKbytes() {
        return this.kbytes;
    }

    public void setKbytes(int kbytes) {
        this.kbytes = kbytes;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    // fim 
    
    //métodos da classe

    public Arquivo () { // construtor vazio
        this(0,0.0,"Nenhum");
    }
    public Arquivo(int k, double p, String a) { // construtor com parametros
        setAutor(a);
        setKbytes(k);
        setPreco(p);
    }

    public String getTipo () {
        return ("Arquivo: ");
    }

    public String getDetalhes () {
        return ( "Arquivo: kbytes-> " + getKbytes() + "Preco-> " + getPreco() + "Autor-> " + getAutor());
    }

    public void printDados () {
        System.out.println("Dados: ");
        System.out.println("Autor: " + getAutor() + " Preco: " + getPreco() + " kBytes: " + getKbytes());
    }

    public void inserirDados () {
        // criando scanner
        Scanner scan = new Scanner(System.in);
        
        //criando variaveis para armazenar os dados
        int kb;
        double p;
        String aut;

        // scaneando 
        System.out.print("Digite o nome do autor: ");
        aut = scan.next();
        System.out.println();
        System.out.print("Digite a quantidade de kbytes do arquivo: ");
        kb = scan.nextInt();
        System.out.println();
        System.out.print("Digite o preco do arquivo: ");
        p = scan.nextDouble();
        
        // colocando os dados scaneados dentro das variaveis de instancia 
        setAutor(aut);
        setKbytes(kb);
        setPreco(p);
    }    
}
