package lista05.q04;

public class ControleRemoto {
    
    Televisao tv = new Televisao();

    public void aumentaVolume () {
        if ( tv.getVolume() < 100 ) {
            tv.setVolume(tv.getVolume() + 1);
        } else {
            System.out.println("Volume no Máximo!");
        }
    }

    public void diminuiVolume () {
        if ( tv.getVolume() == 0 ) {
            System.out.println("Volume no Mínimo!");
        } else {
            tv.setVolume(tv.getVolume() - 1);
        }
    }

    public void sobeCanal () {
        if ( tv.getCanal() < 50 ) {
            tv.setCanal(tv.getCanal() + 1);
        } else { 
            tv.setCanal(0);
        }
    }

    public void desceCanal () {
        if ( tv.getCanal() > 0 ) {
            tv.setCanal(tv.getCanal() - 1);
        } else {
            tv.setCanal(50);
        }
    }

    public void vaiCanal (int novoCanal ) {
        if ( novoCanal > 0 && novoCanal <= 50 ) {
            tv.setCanal(novoCanal);
        }
    }

    public int consultaVolume () {
        return tv.getVolume();
    }

    public int consultaCanal () {
        return tv.getCanal();
    } 
}
