package lista06.q01;

public abstract class Assinatura {
    
    // propriedades
    private String mensagem;
    private String nome;
    private String ramal;

    // getters e setters
    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamal() {
        return this.ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    // metodos
    public abstract void imprimirAssinatura();

}
