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

    //métodos
    public Midia () {
        super();
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
        return ("Nome: " + getNome() + " Preco: " + getPreco() + " Código: " + getCodigo() );
    }

    public void printDados () {
        System.out.println("Nome: " + nome + " Código: " + codigo + " Preço: " + preco  );

    }
    
    public void inserirDados () {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = s.next();
        System.out.println("Digite o código: ");
        int cod = s.nextInt();
        System.out.println("Digite o preco: ");
        double prec = s.nextDouble();

        setCodigo(cod);
        setNome(nome);
        setPreco(prec);

    }

}