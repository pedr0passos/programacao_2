package lista05;

public class Agenda {
    
    private Pessoa[] p = new Pessoa[10];
    
    // colocando valor -1 nos campos da lista
    for (int i = 0; i < 10; i++ ) {
        p[i].setAltura(-1);
        p[i].setIdade(-1);
    }

    public void armazenaPessoa (String nome, int idade, double altura) {
        
    }
}
