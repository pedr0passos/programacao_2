package lista_avaliativa.q01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumeros {
    public void divide() {
        
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Numero1: ");
            int n1 = scan.nextInt();
            System.out.print("Numero2: ");
            int n2 = scan.nextInt();
            int div = (n1/n2);
            System.out.println("Resultado: " + div);
        } catch(InputMismatchException e) {
            System.out.println("Valor Informado não é númerico!");
        } catch (ArithmeticException e) {
            System.out.println("Divisão por Zero, Tente Novamente!");
        } finally {
            scan.close();
        }

    }
}