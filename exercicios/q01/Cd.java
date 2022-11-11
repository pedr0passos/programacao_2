package exercicios.q01;

public class Cd extends Midia {
    // variavel, além das herdadas de Midia
    private int numeroMusicas;

    // getters e setters
    public int getNumeroMusicas() {
        return this.numeroMusicas;
    }

    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }
    
    // métodos do exercício
    // construtor 
    public Cd () {
        this(0,0.0,"Nenhum", 0);
    }
    public Cd (int c, double p, String s, int m) {
        this.setCodigo(c);
        this.setNome(s);
    }   


}
