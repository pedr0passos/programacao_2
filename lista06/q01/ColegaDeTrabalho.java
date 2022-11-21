package lista06.q01;

public class ColegaDeTrabalho extends Assinatura {
    
    @Override
    public void imprimirAssinatura() {
        System.out.println(getMensagem() + ",\n" + getNome() + "\nRamal " + getRamal());
    }

}