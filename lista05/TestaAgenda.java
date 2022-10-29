package lista05;
import java.util.Scanner;

public class TestaAgenda {
    public static void main(String[] args) {
        
        Agenda a = new Agenda();
        Scanner scan = new Scanner(System.in);

        boolean decisao = true;
        int escolha, idade, posicao;
        String nome;
        double altura;

        while (decisao) {
            System.out.println("Digite uma opcao.");
            System.out.println("1 - Armazena Pessoa");
            System.out.println("2 - Remove Pessoa.");
            System.out.println("3 - Busca Pessoa.");
            System.out.println("4 - Imprime a Agenda.");
            System.out.println("5 - Imprime uma Pessoa.");
            System.out.println("6 - Sair.");
            escolha = scan.nextInt();
            switch ( escolha ) {
                case 1:
                    System.out.println("Digite nome: ");
                    nome = scan.next();
                    System.out.println("Digite altura: ");
                    altura = scan.nextDouble();
                    System.out.println("Digite idade: ");
                    idade = scan.nextInt();
                    a.armazenaPessoa(nome, idade, altura);
                break;
                case 2:
                    System.out.println("Digite nome: ");
                    nome = scan.next();
                    a.removePessoa(nome);
                break;
                case 3:
                    System.out.println("Digite nome: ");
                    nome = scan.next();
                    a.buscaPessoa(nome);     
                break;
                case 4:
                    a.imprimeAgenda();
                break;
                case 5:
                    System.out.println("Digite posicao: ");
                    posicao = scan.nextInt();
                    a.imprimePessoa(posicao);
                break;
                case 6:
                    decisao = false;
                break;
                default:
                    decisao = false;
                break;
            }
        }
        scan.close();
    }
}
