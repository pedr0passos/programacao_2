package lista05.q04;

public class Televisao {
    
    //propriedades
    private int volume, canal;
    private boolean ligado;

    public Televisao () {
        ligado = true;
        volume = 25;
        canal = 1;
    }

    //getters
    public int getVolume () {
        return volume;
    }
    public int getCanal () {
        return canal;
    }
    public boolean getLigado () {
        return ligado;
    }

    public void setVolume (int volume) {
        this.volume = volume;
    }
    public void setCanal (int canal) {
        this.canal = canal;
    }
}
