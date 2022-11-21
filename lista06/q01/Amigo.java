package lista06.q01;

public class Amigo extends Assinatura {
    
    @Override
    public void imprimirAssinatura() {
        System.out.println("[]s" + "\n" + getNome());
    }

}
