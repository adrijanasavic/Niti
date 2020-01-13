package Zadatak3;

import java.util.ArrayList;

public class Utovar {

    private boolean dozvolaZaUtovar = true;

    public static void main(String[] args) {

        Magacin magacin = new Magacin(100);

        ArrayList<Kamion> listaKamiona = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            Kamion kamion = new Kamion(10, String.valueOf(i));
            listaKamiona.add(kamion);
        }

        Viljuskar viljuskar1 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar2 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar3 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar4 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar5 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar6 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar7 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar8 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar9 = new Viljuskar(magacin, listaKamiona);
        Viljuskar viljuskar10 = new Viljuskar(magacin, listaKamiona);


        viljuskar1.setName("Viljuskar 1");
        viljuskar2.setName("Viljuskar 2");
        viljuskar3.setName("Viljuskar 3");
        viljuskar4.setName("Viljuskar 4");
        viljuskar5.setName("Viljuskar 5");
        viljuskar6.setName("Viljuskar 6");
        viljuskar7.setName("Viljuskar 7");
        viljuskar8.setName("Viljuskar 8");
        viljuskar9.setName("Viljuskar 9");
        viljuskar10.setName("Viljuskar 10");

        viljuskar1.start();
        viljuskar2.start();
        viljuskar3.start();
        viljuskar4.start();
        viljuskar5.start();
        viljuskar6.start();
        viljuskar7.start();
        viljuskar8.start();
        viljuskar9.start();
        viljuskar10.start();


    }
}
