public class Ingresso {

    // variavel valor 
    private double valor;

    // getters e setters
    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    // fim dos getters e setters

    // método que imprime o valor
    public void imprimeValor () {
        System.out.println("Valor: " + valor);
    }

}