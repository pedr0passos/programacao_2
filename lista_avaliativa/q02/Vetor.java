package lista_avaliativa.q02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        Scanner scan = new Scanner(System.in);
        int resposta;
        int i = 0;

        try {
            while (true) {
                System.out.print("Digite o valor a ser inserido: ");
                resposta = scan.nextInt();
                vetor[i] = resposta;
                i++;
                if (resposta == 0)
                    break;
            }
            System.out.println("---------------------");
            System.out.println("Lista:");

            for ( i=0; vetor[i] != 0; i++)
                System.out.println((i+1) + ":" + vetor[i]);

            System.out.println("---------------------");
            
        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println("Informou mais que 10 valores!");
        } catch ( InputMismatchException e ) {
            System.out.println("Informou um valor não numerico!");
        }  finally {
            scan.close();
        }      
    }
}
