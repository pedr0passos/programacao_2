import java.util.*;
public class Sorteio2 {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    public void sorteia () {
        int n;
        while ( numeros.size() < 6 ) {
            n = (int)(Math.random()*10) + 1;
            if ( !numeros.contains(n) ) {
                numeros.add(n);
            }
        }
    }
    public void listaSorteio () {
        System.out.println("Números Sorteados");
        int i = 0;
        for ( Integer val : numeros ) {
            i++;
            System.out.println(i + ": " + val);
        }
    }


}
