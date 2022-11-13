package exercicios.q01;

import java.util.Scanner;

public class Cd extends Midia {
    // variavel, alem das herdadas de Midia
    private int numeroMusicas;

    // getters e setters
    public int getNumeroMusicas() {
        return this.numeroMusicas;
    }

    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }
    
    
    // construtores
    public Cd () {
        this(0,0,"Nenhum", 0);
    }
    public Cd (int c, double p, String s, int m) {
        super(c,p,s);
        setNumeroMusicas(numeroMusicas);
    }   

    public String getTipo () {
        return ( "CD: ");
    }

    public String getDetalhes () {
        return super.getDetalhes() + "\n" + "Número de Músicas: " + numeroMusicas + "\n"; // retorna os detalhes da superclasse + o número de musicas que tem dentro do cd
    }

    public void inserirDados () {
        //chamando o metodo inserirDados da superclasse de Cd 
        super.inserirDados();
        // criando scanner novo para scannear o número de músicas 
        Scanner s = new Scanner(System.in);
        int numMusicas;

        // lendo o dado numMusicas
        System.out.println("Entre com o número de musicas: "); // comando 
        numMusicas = s.nextInt();      // lendo do teclado
        setNumeroMusicas(numMusicas);   // setando o numero de musicas para o digitado pelo teclado

        // dando close no scanner 
        
    }

}
