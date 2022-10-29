package lista05.q02;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double altura;

    // metodos da classe
    // getters:
    public String getNome () {
        return nome;
    }
    public int getIdade () {
        return idade;
    }
    public double getAltura () {
        return altura;
    }
    //setters:
    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setIdade (int idade) {
        if ( idade >= -1 ) {
            this.idade = idade;
        } else {
            System.out.println("Idade Invalida!");
        }
    }
    public void setAltura (double altura) {
        if ( altura >= -1 ) {
            this.altura = altura;
        } else {
            System.out.println("Altura Invalida!");
        }
    }
    // imprime os dados da pessoa
    public void imprimeDados () {
        System.out.println("Nome: " + nome + " Idade: " + idade + " Altura: " + altura);
    }
}
