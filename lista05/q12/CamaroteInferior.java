public class CamaroteInferior {
    
    private String localizacao;

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao ( ) {
        System.out.println("Localização: " + localizacao);
    }

}
