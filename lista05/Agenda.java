package lista05;

public class Agenda {

    static private int k = 0;
    private Pessoa[] p = new Pessoa[10];

    public void armazenaPessoa(String nome, int idade, double altura) {
        if ( k < 10 ) {
            p[k].setNome(nome);
            p[k].setAltura(altura);
            p[k].setIdade(idade);
            k++;
        }
    }

    public void removePessoa (String nome) {
        for (int i = 0; i < 10; i++) {
            if ( p[i].getNome().equals(nome) ) {
                p[i].setAltura(0);
                p[i].setIdade(0);
                p[i].setNome(null);
            }
        }
    }

    public int buscaPessoa (String nome ) {
        for (int i = 0; i < 10; i++) {
            if ( p[i].getNome().equals(nome) ) {
                return 1;
            }
        }
        return 0;
    }

    public void imprimeAgenda () {
        for (int i = 0; i < 10; i++ ) {
            System.out.println("Nome: " + p[i].getNome() + " Idade: " + p[i].getIdade() + " Altura: " + p[i].getAltura());
        }
    }

    public void imprimePessoa( int index ) {
        System.out.println("Nome: " + p[index].getNome() + " Idade: " + p[index].getIdade() + " Altura: " + p[index].getAltura());
    }
}
