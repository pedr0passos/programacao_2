package lista06.q01;

public class Parente extends Assinatura {
    
    @Override
    public void imprimirAssinatura() {
        System.out.println(getMensagem() + ",\n" + getNome());
    }

}