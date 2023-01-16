package lista_avaliativa.q05;

public class Main {
    public static void main(String[] args) throws ContaException {
        ContaBancaria nova = new ContaBancaria(440, 1000);
        System.out.print("Limite: ");
        System.out.println(nova.getLimite());
        System.out.print("Saldo: ");
        System.out.println(nova.getSaldo());
        System.out.print("Adicionando Dinheiro ao Saldo ");        
        nova.depositar(700);
        System.out.println(nova.getSaldo());
        System.out.print("Sacando Dinheiro da Conta ");
        if (nova.sacar(123))
            nova.depositar(-123);
        System.out.println(nova.getSaldo());
    }
}
