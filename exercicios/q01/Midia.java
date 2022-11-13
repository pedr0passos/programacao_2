package exercicios.q01;

import java.util.Scanner;

public class Midia {

    private int codigo;
    private double preco;
    private String nome;

    // getters e setters
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodos
    public Midia () {
        this(0,0, "Nenhum");
    }
    public Midia ( int c, double p, String n ) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public String getTipo () {
        return ("Midia: ");
    }

    public String getDetalhes () {
        return ("Nome: " + getNome() + " Preco: " + getPreco() + " Codigo: " + getCodigo() );
    }

    public void printDados () {
        System.out.println("Nome: " + nome + " Codigo: " + codigo + " Preco: " + preco  );

    }
    
    public void inserirDados () {

        Scanner s = new Scanner(System.in);
        String nome;
        int cod;
        double prec;


        System.out.println("Digite o nome: ");
        nome = s.next();
        System.out.println("Digite o codigo: ");
        cod = s.nextInt();
        System.out.println("Digite o preco: ");
        prec = s.nextDouble();

        setCodigo(cod);
        setNome(nome);
        setPreco(prec);

    }

}