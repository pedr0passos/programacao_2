public class Sorteio {
    private int[] numeros = new int[6];

    public void sorteia () {
        int i = 0;
        int n;
        boolean repete;

        while ( i < 6 ) {
            repete = false;
            n = (int)(Math.random()*10) + 1;
            for ( int j = 0; j < i; ) {
                if ( numeros[j] == n )
                    repete = true;
                    break;
            }
            if ( !repete )
                numeros[i] = n;
                i++;
        }
    }
    public void listaSorteio () {
        System.out.println("N�meros Sorteados:");
        int i = 0;
        for ( int val : numeros ) {
            i++;
            System.out.println(i + ": " + val);
        }
    }

}