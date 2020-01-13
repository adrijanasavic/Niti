package Zadatak3;

import java.util.ArrayList;

public class Viljuskar extends Thread {

    private Magacin magacin;
    private ArrayList<Kamion> listaKamiona;

    boolean dobioDozvolu = false;

    public Viljuskar(Magacin magacin, ArrayList<Kamion> listaKamiona) {
        this.magacin = magacin;
        this.listaKamiona = listaKamiona;
    }

    public synchronized void utovar() {
        if (magacin.uzmiPaletu()) {
            try {
                this.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            do {
                for (Kamion kamion : listaKamiona) {
                    if (kamion.utovariPaletu()) {
                        dobioDozvolu = true;
                        System.out.println(this.getName() + " utovara u " + "kamion " + kamion.ime + " koji ima trenutno paleta "
                                + kamion.getUtovarenBrojPaleta());

                        continue;

                    } else {
                        dobioDozvolu = false;
                    }
                }
            } while (!dobioDozvolu);
        }
    }

    @Override
    public void run() {
        utovar();
    }
}


