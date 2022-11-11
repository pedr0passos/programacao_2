package exercicios.q01;

import java.util.Scanner;

public class Dvd extends Midia {
    // propriedade da classe dvd
    private int numeroFaixas;   
    /*
        Propriedades Herdadas de Midia:
            - codigo
            - preco
            - nome
    */
    public int getNumeroFaixas() {
        return this.numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    public Dvd () {
        this(0,0.0,"Nenhum", 0);
    }

    public Dvd ( int c, double p, String s, int f ) {
        this.setCodigo(c);
        this.setNome(s);
        this.setPreco(p);
        this.numeroFaixas = f; 
    }

    @Override
    public String getTipo () {
        return ( "Midia :" );
    }

    @Override
    public String getDetalhes() {
        return ( "Nome: " + getNome() + " Preco: " + getPreco() + " Código: " + getCodigo());
    }

    @Override
    public void inserirDados () {
        // aproveitando o código já pronto da sua superclasse
        super.inserirDados();
        // criando um novo scanner para pegar apenas a informação adicional da classe dvd
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número de faixas: ");
        int nF = s.nextInt();

        setNumeroFaixas(nF);
    }
}
