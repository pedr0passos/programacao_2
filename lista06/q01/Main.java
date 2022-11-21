package lista06.q01;

public class Main {
    public static void main(String[] args) {
        
        Amigo a = new Amigo();
        ColegaDeTrabalho c = new ColegaDeTrabalho();
        Parente p = new Parente();

        a.setNome("Joacir Fiqueiredo");
        c.setMensagem("Atenciosamente");
        c.setNome("Joacir Figueiredo");
        c.setRamal("2345");
        p.setMensagem("Ate mais");
        p.setNome("Joacir Figueiredo");

        a.imprimirAssinatura();
        c.imprimirAssinatura();
        p.imprimirAssinatura();

    }
}
