package exercicios.q02;

import java.util.Random;
import java.util.Scanner;

public class TestaArquivo {
    public static void main(String[] args) {
        // criando a lista 
        Arquivo[] lista = new Arquivo[3];
        // criando o objeto random, que cria números randomicos
        Random random = new Random();
        
        int chance, kb, numVisitas, numDownloads;
        double preco;
        String autor;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i ++ ) {
            chance = random.nextInt(100);
            if ( chance > 50 ) {
                System.out.print("Digite o nome do autor: ");
                autor = scan.next();
                kb = random.nextInt(1000);
                preco = random.nextDouble();
                numVisitas = random.nextInt(1000000);
                lista[i] = new Mp4();
            } else {
                lista[i] = new  Mp3();
            }
        }

    }
}
