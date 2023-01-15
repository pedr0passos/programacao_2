package lista_avaliativa.q03;

public class Main {
    public static void main(String[] args) {
        Login l = new Login("Pedro045", "123456");
        boolean logou = l.fazerLogin("Pedro045", "123456");
        System.out.println(logou);
    }
}
