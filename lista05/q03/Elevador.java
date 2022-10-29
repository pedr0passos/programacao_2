package lista05.q03;

public class Elevador {

    //propriedades
    private int andar, capacidade, totalAndares, pessoas;
    
    //metodos

    //setters:
    public void setTotalAndares( int totalAndares ) {
        if ( totalAndares > 0 ) {
            this.totalAndares = totalAndares;
        } else {
            System.out.println("Total Inválido");
        }
    } 
    public void setCapacidade (int capacidade ) {
        if ( capacidade > 0 ) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Capacidade Inválida!");
        }
    }
    
    // getters 
    public int getAndar () {
        return andar;
    }
    public int getCapacidade () {
        return capacidade;
    }
    public int getTotalAndares () {
        return totalAndares;
    }
    public int getPessoas () {
        return pessoas;
    }

    // metodos da questão
    public Elevador ( int capacidade, int totalAndares) {
        andar = 0;
        pessoas = 0;
    }
    public void entra () {
        if ( capacidade > pessoas ) {
            pessoas++;
        } else {
            System.out.println("Elevador Cheio!");
        }        
    }
    public void sai () {
        if ( pessoas > 0 ) {
            pessoas--;
        } else {
            System.out.println("Elevador Vazio!");
        }
    }
    public void sobe () {
        if ( andar < totalAndares ) {
            andar++;
        } else {
            System.out.println("Elevador está no Ultimo Andar!");
        }
    }
    public void desce () {
        if ( andar == 0 ) {
            System.out.println("Elevador no Térreo");
        } else {
            andar--;
        }
    }

}
