package exercicios.q01;

import java.util.Scanner;

public class TestaMidia {
    public static void main(String[] args) {
        Midia[] lista = new Midia[5];

        int opcao;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite 1 para CD e 2 para DVD ");
            Scanner s = new Scanner(System.in); // scanner 
            opcao = s.nextInt();                // lendo dado da opcao que a pessoa quer colocar

            if ( opcao == 1 ) 
                lista[i] = new Cd();
            else if ( opcao == 2 )
                lista[i] = new Dvd();
            else 
                System.out.println("Valor inválido.");
            lista[i].inserirDados();
            
        }

        for (int i = 0; i < 5; i++ )
            lista[i].printDados();
        
    }
}
